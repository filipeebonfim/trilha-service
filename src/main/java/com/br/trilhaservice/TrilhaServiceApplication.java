package com.br.trilhaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class TrilhaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrilhaServiceApplication.class, args);
    }

}
