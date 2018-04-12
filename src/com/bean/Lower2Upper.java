package com.bean;

import com.util.ConvertCase;

public class Lower2Upper implements ConvertCase {

	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String convert() {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

}
