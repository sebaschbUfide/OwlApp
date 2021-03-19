package Owlearning.OwlApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class , ErrorMvcAutoConfiguration.class})
public class OwlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwlAppApplication.class, args);
	}


1


}
