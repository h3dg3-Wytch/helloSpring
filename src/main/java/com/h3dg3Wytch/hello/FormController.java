package com.h3dg3Wytch.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by rex on 8/9/16.
 */
@Controller
public class FormController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homeForm(Model model){
        model.addAttribute("user", new User());
        return "home";
    }
    @RequestMapping(value = "/home", method =RequestMethod.POST)
    public String homeSubmit(@Valid User user, BindingResult result, Model model){

        if(result.hasErrors()){
            return "home";
        }


        model.addAttribute("user", user);
        return "result";
    }

}
