package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by rex on 7/15/16.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting", method=RequestMethod.GET)
    public String greeting( @RequestParam(value = "name", required = false, defaultValue = "Worlds") String name, Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }


    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }





}
