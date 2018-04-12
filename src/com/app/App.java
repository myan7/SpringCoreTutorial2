package com.app;

import org.springframework.context.ApplicationContext;

import com.util.ApplicationContextUtil;
import com.util.ConvertCase;
import com.util.ValidateUser;

public class App {

	public static void main(String[] args) {
		// By using combination of interface and Dependency Injection
//		we can easily decouple the app class and the bean class
		ApplicationContext ac = ApplicationContextUtil.get();
		ConvertCase fc = (ConvertCase) ac.getBean("convert"); 
		System.out.println(fc.convert());
//		We don't need to change anything here even if we want to call different functions.
//		say if we want to change a string from uppercase to lowercase, we just need to 
//		uncomment the lower2upper in the bean xml, visa versa
		
		ValidateUser vu = (ValidateUser) ac.getBean("user");
		vu.check();
	}

}
