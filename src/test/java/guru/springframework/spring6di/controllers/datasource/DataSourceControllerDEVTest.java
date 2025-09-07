package guru.springframework.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@ActiveProfiles("DEV")
@SpringBootTest
public class DataSourceControllerDEVTest {

    @Autowired
    DataSourceController dsController;
    
    @Test
    void testDataSource() {
        System.out.println(dsController.getDataSource());
    }
}
