package guru.springframework.spring6di.controllers.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spring6di.services.datasource.DataSourceService;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class DataSourceController {
    private final DataSourceService dataSourceservice;

    public DataSourceController(@Qualifier("dataSourceService")  DataSourceService dataSourceService) {
        this.dataSourceservice = dataSourceService;
    }

    public String getDataSource(){
        return dataSourceservice.getDataSource();
    }
}