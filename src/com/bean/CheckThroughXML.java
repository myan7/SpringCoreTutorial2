package com.bean;

import com.util.ValidateUser;

public class CheckThroughXML implements ValidateUser {
	
	@Override
	public void check() {
		System.out.println("This user is validated in XML.");

	}

}
