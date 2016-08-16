package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rex on 7/20/16.
 */
@Controller
public class IndexController {

//    @RequestMapping(value =  "/", method=RequestMethod.GET)
//    public String salutations(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model){
//        model.addAttribute("user", new User());
//        return "salutations";
//    }
//
//    @RequestMapping(value =  "/", method=RequestMethod.POST)
//    public String salutationsSubmit(@ModelAttribute User user, Model model){
//        model.addAttribute("user", user);
//        return "results";
//    }

}
