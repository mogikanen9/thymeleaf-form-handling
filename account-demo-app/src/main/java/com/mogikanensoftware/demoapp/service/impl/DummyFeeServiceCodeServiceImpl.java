package com.mogikanensoftware.demoapp.service.impl;

import java.util.Arrays;
import java.util.List;

import com.mogikanensoftware.demoapp.form.FeeServiceCode;
import com.mogikanensoftware.demoapp.service.FeeServiceCodeService;

public class DummyFeeServiceCodeServiceImpl implements FeeServiceCodeService {

	@Override
	public List<FeeServiceCode> listAll() {
		return Arrays.asList(new FeeServiceCode(203, "General review"), new FeeServiceCode(204, "Specialized review"));
	}

	@Override
	public FeeServiceCode getById(int code) {
		switch (code) {
		case 203:
			return new FeeServiceCode(203, "General review");
		case 204:
			return new FeeServiceCode(204, "Specialized review");
		default:
			return new FeeServiceCode(-1, "Unknown");
		}
	}

}
