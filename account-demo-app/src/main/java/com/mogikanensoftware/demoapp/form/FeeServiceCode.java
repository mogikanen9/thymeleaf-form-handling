package com.mogikanensoftware.demoapp.form;

public class FeeServiceCode {

	private int code;
	private String name;

	public FeeServiceCode() {
		super();
	}

	public FeeServiceCode(int code, String name) {
		this();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return code + " - " + name;
	}

}
