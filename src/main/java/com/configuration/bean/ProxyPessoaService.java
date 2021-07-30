package com.configuration.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name="application.pessoa-service.enabled", havingValue = "true", matchIfMissing = true)
public class ProxyPessoaService extends AbstractProxyPessoaService{
	
	Logger log = LoggerFactory.getLogger(ProxyPessoaService.class);
	
	@Override
	public void metodo() {
		log.info("chama metodo real");
		// codigo de excução normal
	}

}
