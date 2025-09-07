package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class DataSourceServiceImplDEV implements DataSourceService {

    private final String dataSource = "jdbc:h2:localhost:2020/UserDB - DEV";

    @Override
    public String getDataSource() {
        return dataSource;
    }

}
