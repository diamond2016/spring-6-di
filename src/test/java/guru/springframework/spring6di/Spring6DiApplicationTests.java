package guru.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    MyController myController;

    @Test
    void testGetControllerFromCtx() {
        MyController controller = applicationContext.getBean(MyController.class);
        System.out.println("In test from context");
        System.out.println(controller.sayHello());
    }

    @Test
    void testGetControllerFromInstance() {
        System.out.println(myController.sayHello());
        System.out.println("In test from instance ");
    }

    @Test
    void contextLoads() {
    }

}
