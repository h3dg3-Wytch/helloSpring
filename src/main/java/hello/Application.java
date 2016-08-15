package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rex on 7/15/16.
 */
@SpringBootApplication
public class Application{

    @Autowired
    ContactDAO contactDAO;
    private static final Logger log = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }


}
