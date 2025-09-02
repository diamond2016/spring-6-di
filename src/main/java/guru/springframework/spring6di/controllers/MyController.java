package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayGreeString() {
        System.out.println("I am the controller");
        greetingService.sayGreeting();

        return "Hello from greeting";
    }

    public String sayHello() {
        System.out.println("I am the controller");

        return "Hello everyone!!";
    }

}
