package com.configuration.bean.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configuration.bean.PessoaService;
import com.configuration.bean.sublcass.CarroServiceCore;

@RestController
public class BeanController {

	Logger log = LoggerFactory.getLogger(BeanController.class);
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private CarroServiceCore carroServiceCore;
	
	@GetMapping("/test")
	public void test() {
		log.info("controller .... ");
		pessoaService.metodo();
	}
	
	@GetMapping("/testcarro")
	public void testcarro() {
		log.info("controller carro.... ");
		carroServiceCore.carro();
	}
}
