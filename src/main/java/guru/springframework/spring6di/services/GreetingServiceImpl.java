package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        System.out.println("greeeting from service");
        return null;
    }
}
