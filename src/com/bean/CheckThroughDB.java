package com.bean;

import com.util.ValidateUser;

public class CheckThroughDB implements ValidateUser {

	@Override
	public void check() {
		System.out.println("This user is validated through DataBase.");

	}

}
