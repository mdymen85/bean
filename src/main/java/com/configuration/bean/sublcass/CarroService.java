package com.configuration.bean.sublcass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(name="application.carro-service.enabled", havingValue = "false", matchIfMissing = false)
@Service
public class CarroService {

	Logger log = LoggerFactory.getLogger(CarroService.class);
	
	public void method1() {
		log.info("Chamando o metodo da classe pai que nao carrega no contexto de Spring....");
		
	}

}
