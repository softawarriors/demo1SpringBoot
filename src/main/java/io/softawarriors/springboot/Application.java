package io.softawarriors.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Going to the starting point of the Spring Boot Application
 **/
@SpringBootApplication
public class Application {

    public static void main(String... args){
        /**
         * Start the application Create Servlet Container and host this application in the container.
         * It takes the class that will be the starting point and the arguments passed to main method of Spring Application Class.

         * Following are the steps done by the {@link SpringApplication} run method
            1. Sets up default configuration  - 80% of the common use case
            2. Starts Spring Application Context - Spring is container for all the services(data services, business services)
            3. Performs class path scan - (the way to plugin custom classes into Spring Boot framework with markers based on the
         type. Class path scan the codes and tell the Spring about the behaviour of that class going to be)
            4. Starts Tomcat Server - default if not other is configured
        **/

        SpringApplication.run(Application.class, args);
    }
}
