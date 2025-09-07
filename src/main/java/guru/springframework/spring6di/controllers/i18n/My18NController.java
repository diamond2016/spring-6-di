package guru.springframework.spring6di.controllers.i18n;

import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

@Controller
public class My18NController {

    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
