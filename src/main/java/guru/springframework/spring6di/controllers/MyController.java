package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    
    public String sayHello() {
        System.out.println("I am the controller");

        return "Hello everyone!!";
    }

}
