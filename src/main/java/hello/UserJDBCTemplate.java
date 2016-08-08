package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rex on 8/8/16.
 */
@Component
public class UserJDBCTemplate implements UserDAO {

    @Autowired
   JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {



    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
