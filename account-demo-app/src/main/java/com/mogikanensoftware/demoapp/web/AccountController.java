package com.mogikanensoftware.demoapp.web;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mogikanensoftware.demoapp.form.Account;
import com.mogikanensoftware.demoapp.form.FeeServiceCode;
import com.mogikanensoftware.demoapp.service.FeeServiceCodeService;

@Controller
public class AccountController {

	private FeeServiceCodeService feeServiceCode;
		
	public AccountController(@Autowired FeeServiceCodeService feeServiceCode){
		this.feeServiceCode = feeServiceCode;
	}

	@ModelAttribute("allFsc")
	public List<FeeServiceCode> populateFsc() {
		return feeServiceCode.listAll();
	}

	@GetMapping(path = "/account")
	public String showAccountForm(Model model) {
		model.addAttribute("account", new Account());
		return "account";
	}

	@PostMapping(path = "/account")
	public String submitAccountForm(@ModelAttribute @Valid Account account, BindingResult bindingResult) {
		String dest = "result";
		if (bindingResult.hasErrors()) {
			dest = "account";
		}
		return dest;
	}
}
