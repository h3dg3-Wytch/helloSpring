package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rex on 8/16/16.
 */
@Controller
public class HomeController {

    @Autowired
    private ContactDAO contactDAO;

    @RequestMapping(value = "/")
    public String listContact(Model model){
        List<Contact> listContact = contactDAO.list();
        model.addAttribute("contactList", listContact);
        return "home";
    }

    @RequestMapping(value = "/newContact", method = RequestMethod.GET)
    public String newContact(Model model){
        Contact newContact = new Contact();
        model.addAttribute("contact", newContact);
        return "contactForm";
    }
    @RequestMapping(value = "/saveContact", method = RequestMethod.POST)
    public String saveContact(@ModelAttribute Contact contact){
        contactDAO.saveOrUpdate(contact);
        return "redirect:/";
    }
    @RequestMapping(value = "/deleteContact" , method = RequestMethod.GET)
    public String deleteContact(HttpServletRequest request){
        int contactId = Integer.parseInt(request.getParameter(("id")));
        contactDAO.delete(contactId);
        return "redirect:/";
    }

    @RequestMapping(value = "/editContact", method = RequestMethod.GET)
    public String editContact(HttpServletRequest request, Model model){
        int contactId = Integer.parseInt(request.getParameter("id"));
        Contact contact = contactDAO.get(contactId);
        model.addAttribute("contact", contact);
        return "contactForm";
    }
}
