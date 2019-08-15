package com.training.RegistrationForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@SpringBootApplication
public class RegistrationFormApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationFormApplication.class, args);
    }
}
