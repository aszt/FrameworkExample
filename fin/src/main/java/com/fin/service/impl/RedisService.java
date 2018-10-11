package com.fin.service.impl;

import com.fin.bean.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

@Service
public class RedisService {

    // 注入分片的连接池
    //按需添加，当且仅当工程spring注入了ShardedJedisPool才会用到
    @Autowired(required=false)
    private ShardedJedisPool pool;

    //公共方法抽取
    public <T> T execute(Function<T, ShardedJedis> func){
        ShardedJedis shardedJedis = null;
        try {
            // 从池中获取连接
            shardedJedis = pool.getResource();
            // 添加数据
            return func.commond(shardedJedis);
        } finally {
            if (null != shardedJedis) {
                shardedJedis.close();
            }
        }
    }

    public String set(final String key, final String value) {
        return this.execute(new Function<String, ShardedJedis>() {
            @Override
            public String commond(ShardedJedis e) {
                return e.set(key, value);
            }
        });
    }

    /**
     * 执行set命令，添加字符串格式数据
     *
     * @param key
     * @param value
     * @return
     */
//    public String set(String key, String value) {
//        ShardedJedis shardedJedis = null;
//        try {
//            // 从池中获取连接
//            shardedJedis = pool.getResource();
//            // 添加数据
//            return shardedJedis.set(key, value);
//        } finally {
//            if (null != shardedJedis) {
//                shardedJedis.close();
//            }
//        }
//    }

    /**
     * 执行get命令，查询字符串格式数据
     *
     * @param key
     * @return
     */
    public String get(final String key) {
        return execute(new Function<String, ShardedJedis>() {
            @Override
            public String commond(ShardedJedis jedis) {
                return jedis.get(key);
            }
        });
    }

    /**
     * 执行expire命令，设置存活时间
     * @param key
     * @param seconds
     * @return
     */
    public Long expire(final String key, final Integer seconds){
        return execute(new Function<Long, ShardedJedis>() {
            @Override
            public Long commond(ShardedJedis jedis) {
                return jedis.expire(key, seconds);
            }
        });
    }

    /**
     * 执行set命令，添加字符串格式数据，并且设置存活时间,单位是秒
     * @param key
     * @param value
     * @return
     */
    public String set(final String key, final String value, final Integer seconds) {
        return execute(new Function<String, ShardedJedis>() {
            @Override
            public String commond(ShardedJedis jedis) {
                String str = jedis.set(key, value);
                jedis.expire(key, seconds);
                return str;
            }
        });
    }

    /**
     * 执行del命令，删除数据
     * @param key
     * @return
     */
    public Long del(final String key){
        return execute(new Function<Long, ShardedJedis>() {
            @Override
            public Long commond(ShardedJedis jedis) {
                return jedis.del(key);
            }
        });
    }
}
