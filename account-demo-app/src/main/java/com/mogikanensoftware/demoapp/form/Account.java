package com.mogikanensoftware.demoapp.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Account {

	@Size(min = 10, max = 10)
	private String number;

	private String code;

	@NotEmpty
	private String billingNumber;

	private FeeServiceCode fscCode;

	public FeeServiceCode getFscCode() {
		return fscCode;
	}

	public void setFscCode(FeeServiceCode fscCode) {
		this.fscCode = fscCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBillingNumber() {
		return billingNumber;
	}

	public void setBillingNumber(String billingNumber) {
		this.billingNumber = billingNumber;
	}

}
