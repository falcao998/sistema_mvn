package br.com.sys.souza.sistema.mvn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
	
	private String url;
	private String driverClassName;
	private String username;
	private String password;
	
	@Profile("dev")
	@Bean
	public String testDevConnection() {
		System.out.println("DB CONNECTION DEV - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection H2_DEV - Instancia Teste";
	}
	
	@Profile("prod")
	@Bean
	public String testProdConnection() {
		System.out.println("DB CONNECTION PROD - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection H2_PROD - Instancia Teste";
	}
	
}