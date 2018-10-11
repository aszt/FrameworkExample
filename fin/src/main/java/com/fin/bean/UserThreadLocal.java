package com.fin.bean;

import com.fin.pojo.Accounts;

/**
 * 用户线程池
 */
public class UserThreadLocal {
    private static ThreadLocal<Accounts> accountLocal = new ThreadLocal<Accounts>();

    public static void set(Accounts account) {
        accountLocal.set(account);
    }

    public static Accounts get() {
        return accountLocal.get();
    }

    public static void remove() {
        accountLocal.remove();
    }
}
