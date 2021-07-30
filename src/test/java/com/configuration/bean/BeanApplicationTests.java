package com.configuration.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BeanApplicationTests {

	@Autowired
	private PessoaService pessoaService;
	
	@Test
	void contextLoads() {
		pessoaService.metodo();
	}

}
