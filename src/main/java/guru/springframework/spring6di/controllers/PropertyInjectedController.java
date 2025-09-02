package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greeetingService;

    public String sayHello() {
        return greeetingService.sayGreeting();
    }
}
