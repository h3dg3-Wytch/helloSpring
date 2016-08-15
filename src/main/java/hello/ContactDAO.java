package hello;

import java.util.List;

/**
 * Created by rex on 8/15/16.
 */
public interface ContactDAO {

    public void saveOrUpdate(Contact contact);

    public void delete(int contactId);

    public Contact get(int contactId);

    public List<Contact> list();
}
