package com.mogikanensoftware.demoapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;

import com.mogikanensoftware.demoapp.conversion.FeeServiceCodeFormatter;
import com.mogikanensoftware.demoapp.service.FeeServiceCodeService;
import com.mogikanensoftware.demoapp.service.impl.DummyFeeServiceCodeServiceImpl;

@Configuration
public class ThymeleafConfig {

	@Bean
	public ConversionService conversionService() {
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService(false);
		conversionService.addFormatter(feeServiceCodeFormatter());
		return conversionService;
	}

	@Bean
	public FeeServiceCodeFormatter feeServiceCodeFormatter() {
		return new FeeServiceCodeFormatter(feeServiceCodeService());
	}

	@Bean
	public FeeServiceCodeService feeServiceCodeService() {
		return new DummyFeeServiceCodeServiceImpl();
	}

}
