package ua.lviv.iot.athletics.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.athletics.rest.dataaccess", "ua.lviv.iot.athletics.rest.bussiness",
        "ua.lviv.iot.athletics.rest.controller" })
@EnableJpaRepositories({ "ua.lviv.iot.athletics.rest.dataaccess" })
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }

}
