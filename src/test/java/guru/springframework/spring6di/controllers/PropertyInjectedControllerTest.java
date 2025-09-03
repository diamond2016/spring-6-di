package guru.springframework.spring6di.controllers;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import guru.springframework.spring6di.services.GreetingServiceImpl;

@SpringBootTest
public class PropertyInjectedControllerTest {
    @Autowired
    PropertyInjectedController propertyInjectedController;

/*
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
*/
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}
