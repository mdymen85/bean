package com.configuration.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

	Logger log = LoggerFactory.getLogger(PessoaService.class);
	
	@Autowired
	private AbstractProxyPessoaService abstractProxyPessoaService;
	
	public void metodo() {
		
		log.info("chamada PessoaService...");
		
		abstractProxyPessoaService.metodo();
	}
	
	
}
