package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by rex on 8/8/16.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {


    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
        dataSource.setUsername("dev");
        dataSource.setPassword("password");
        return dataSource;
    }

    @Bean
    public ContactDAO getContactDAO() {
        return new ContactDAOImpl(getDataSource());
    }

}