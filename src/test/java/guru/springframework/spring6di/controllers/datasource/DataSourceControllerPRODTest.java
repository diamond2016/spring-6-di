package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PROD")
@SpringBootTest
public class DataSourceControllerPRODTest {

    @Autowired
    DataSourceController dsController;
    
    @Test
    void testDataSource() {
        System.out.println(dsController.getDataSource());
    }
}
