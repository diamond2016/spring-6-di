package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ActiveProfiles("EN")
@SpringBootTest
public class My18NControllerTestEN {

    @Autowired
    My18NController my18NController;
    
    @Test
    void sayHello() {
        System.out.println(my18NController.sayHello());
    }
}
