package com.mogikanensoftware.demoapp.service;

import java.util.List;

import com.mogikanensoftware.demoapp.form.FeeServiceCode;

public interface FeeServiceCodeService {

	List<FeeServiceCode> listAll();
	FeeServiceCode getById(int code);
}
