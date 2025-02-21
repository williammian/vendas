package br.com.wm.vendasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApiApplication {
	
	@GetMapping(path = {"/hello", "/hello/{nome}"})
	public String hello( @PathVariable(required = false) String nome ) {
		return "Hello " + (nome != null && nome.length() > 0 ? nome : "world");
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApiApplication.class, args);
	}

}
