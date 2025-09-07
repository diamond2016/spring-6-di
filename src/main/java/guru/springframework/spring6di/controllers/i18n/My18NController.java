package guru.springframework.spring6di.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.GreetingService;

@Controller
public class My18NController {

    private GreetingService greetingService;
    public My18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    String sayHello() {
        return greetingService.sayGreeting();
    }
}
