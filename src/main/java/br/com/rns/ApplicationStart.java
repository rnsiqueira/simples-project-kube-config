package br.com.rns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationStart {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationStart.class, args);
    }
}
