package hello;

import java.util.List;

/**
 * Created by rex on 8/8/16.
 */
public interface UserDAO {

    public void create(String name, Integer age);

    public List<User> listUsers();
}
