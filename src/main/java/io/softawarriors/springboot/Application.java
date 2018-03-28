package io.softawarriors.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Going to the starting point of the Spring Boot Application
 **/
@SpringBootApplication
public class Application {

    public static void main(String... args){
        //Start the application Create Servlet Container and host this application in the container
        //It takes the class that will be the starting point
        SpringApplication.run(Application.class, args);
    }
}
