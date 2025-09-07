package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class DataSourceServiceImplPROD implements DataSourceService {

    private final String dataSource = "jdbc:h2:localhost:3020/UserDB - PROD";

    @Override
    public String getDataSource() {
        return dataSource;
    }

}
