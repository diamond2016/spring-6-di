package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("dataSourceService")
public class DataSourceServiceImplQA implements DataSourceService {

    private final String dataSource = "jdbc:h2:localhost:2021/UserDB - QA";

    @Override
    public String getDataSource() {
        return dataSource;
    }

}
