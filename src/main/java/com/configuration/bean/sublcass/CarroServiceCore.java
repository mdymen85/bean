package com.configuration.bean.sublcass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroServiceCore {

	Logger log = LoggerFactory.getLogger(CarroServiceCore.class);
	
	@Autowired
	private CarroService carroService;
	
	public void carro() {
		if (carroService instanceof CarroServiceSubClass) {
			log.info("instancia de carroService eh CarroServiceSubClass");
		}
		carroService.method1();
	}
	
}
