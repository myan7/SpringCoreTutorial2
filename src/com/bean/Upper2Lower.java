package com.bean;

import com.util.ConvertCase;

public class Upper2Lower implements ConvertCase {

	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String convert() {
		return str.toLowerCase();
	}

}
