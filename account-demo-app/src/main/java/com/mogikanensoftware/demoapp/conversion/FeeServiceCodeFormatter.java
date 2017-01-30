package com.mogikanensoftware.demoapp.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.mogikanensoftware.demoapp.form.FeeServiceCode;
import com.mogikanensoftware.demoapp.service.FeeServiceCodeService;

public class FeeServiceCodeFormatter implements Formatter<FeeServiceCode> {

	private FeeServiceCodeService feeServiceCode;

	public FeeServiceCodeFormatter(FeeServiceCodeService feeServiceCode) {
		super();
		this.feeServiceCode = feeServiceCode;
	}


	@Override
	public String print(FeeServiceCode arg0, Locale arg1) {
		return arg0 != null ? Integer.toString(arg0.getCode()) : "-1";
	}

	@Override
	public FeeServiceCode parse(String code, Locale arg1) throws ParseException {
		return feeServiceCode.getById(Integer.parseInt(code));
	}

}
