package guru.springframework.spring6di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        System.out.println("greeeting from service");
        return null;
    }
}
