package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"ES", "DEV"})
@SpringBootTest
public class My18NControllerTestES {

    @Autowired
    My18NController my18NController;
    
    @Test
    void sayHello() {
        System.out.println(my18NController.sayHello());
    }
}

