package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class DataSourceServiceImplUAT implements DataSourceService {

    private final String dataSource = "jdbc:h2:localhost:2023/UserDB  - UAT";

    @Override
    public String getDataSource() {
        return dataSource;
    }

}
