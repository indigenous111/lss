package org.indigenous.lss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("org.indigenous.lss")
@CrossOrigin(origins = "http://localhost:4200")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
