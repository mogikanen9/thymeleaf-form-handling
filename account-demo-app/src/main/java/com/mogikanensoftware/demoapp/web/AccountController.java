package com.mogikanensoftware.demoapp.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mogikanensoftware.demoapp.form.Account;

@Controller
public class AccountController {

	@GetMapping(path="/account")
	public String showAccountForm(Model model){
		model.addAttribute("account", new Account());
		return "account";
	}
	
	@PostMapping(path="/account")
	public String submitAccountForm(@ModelAttribute @Valid Account account, BindingResult bindingResult){
		String dest = "result";
		if(bindingResult.hasErrors()){
			dest = "account";
		}
		return dest;
	}
}
