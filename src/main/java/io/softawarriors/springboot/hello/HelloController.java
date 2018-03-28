package io.softawarriors.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@link RestController} makes a class rest controller
 * This class will have methods map to urls
 */

@RestController
public class HelloController {

    /**
     {@link RequestMapping} by default is get method, otherwise to define other methods of http that has to be configured in annotations
     */

    @RequestMapping("/hello")
    public String sayHi(){
        return "hi";
    }
}
