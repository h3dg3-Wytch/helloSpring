package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by rex on 7/15/16.
 */
@Controller
public class HelloController {

    @Autowired
    ContactDAOImpl contactDAO;

    @RequestMapping(value = "/greeting", method=RequestMethod.GET)
    public String greeting( @RequestParam(value = "name", required = false, defaultValue = "Worlds") String name, Model model){

        List<Contact> contacts = contactDAO.list();
        for(Contact contact : contacts){
            System.out.println(contact.getName());
        }
        model.addAttribute("contactList", contactDAO);
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }


    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }





}
