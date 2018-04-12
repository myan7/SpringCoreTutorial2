package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	private static ApplicationContext ac;
	private ApplicationContextUtil()
	{
		
	}
	public ApplicationContext getAc() {
		return ac;
	}
	public void setAc(ApplicationContext ac) {
		this.ac = ac;
	}
	static {
		ac = new ClassPathXmlApplicationContext("com/util/beans.xml");
	}
	public static ApplicationContext get()
	{
		return ac;
	}
}
