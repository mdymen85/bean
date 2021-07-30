package com.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
//	@Bean(name = "proxyPessoaDumyService")
//	@ConditionalOnProperty(name="application.pessoa-service.enabled", havingValue = "false", matchIfMissing = false)
//	public AbstractProxyPessoaService myAbstractProxyPessoaService() {
//			return new ProxyPessoaDumyService();
//	}
//	
//	@Bean(name = "proxyPessoaService")
//	@ConditionalOnProperty(name="application.pessoa-service.enabled", havingValue = "true", matchIfMissing = true)
//	public AbstractProxyPessoaService myAbstractProxyPessoaService2() {
//		return new ProxyPessoaService();
//	}
	
}
