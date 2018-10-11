package com.tcy.ssh.converters;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 定义类型转换器 在配置文件中配置xwork-conversion.properties使用
 * 
 * @author tong
 *
 */
public class SSHDateConverter extends StrutsTypeConverter {

	private DateFormat dateFormat;

	{
		// 本类对象被创建时执行 如果加了static 修饰，则在本类被加载时就执行
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	}

	// String转目标类型
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		if (arg2 == Date.class) {
			try {
				return dateFormat.parse(arg1[0]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	// 目标类型转为String
	@Override
	public String convertToString(Map arg0, Object arg1) {
		if(arg1 instanceof Date){
			return dateFormat.format((Date)arg1);
		}
		return null;
	}

}
