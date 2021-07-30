package com.configuration.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = "application.pessoa-service.enabled:false")
public class ProxyPessoaDumyTest {

	@Autowired
	private PessoaService pessoaService;
	
	@Test
	void contextLoads() {
		pessoaService.metodo();
	}

	
}
