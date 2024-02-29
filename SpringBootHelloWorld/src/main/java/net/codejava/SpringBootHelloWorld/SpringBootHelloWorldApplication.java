package net.codejava.SpringBootHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello World Spring Boot";
	}

	@RequestMapping("/new")
	public String newhome(){
		return "<html> <body> <h1> Hello World Spring Boot</h1> </body> </html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}

}
