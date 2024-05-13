package dev.eric.MovieGenie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieGenieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieGenieApplication.class, args);
	}



	@GetMapping("/root")
	public String apiRoot() {
		return "Hello, World!";
	}
}
