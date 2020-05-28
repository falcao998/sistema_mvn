package br.com.sys.souza.sistema.mvn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public String hello() {
		return "Olá, Digital Innovation One - Felipe Souza Cerqueira dos Santos";
	}

}
