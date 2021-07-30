package com.configuration.bean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configuration.bean.PessoaService;

@RestController
public class BeanController {

	Logger log = LoggerFactory.getLogger(BeanController.class);
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/test")
	public void test() {
		log.info("controller .... ");
		pessoaService.metodo();
	}
}
