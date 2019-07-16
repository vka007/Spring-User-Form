package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

    @RequestMapping("/")
    public String display(Model model)
    {
        User user = new User("StackRoute");
        model.addAttribute("output",user.getName());


      //  model.addObject("output","demo");
        return "index";
    }

}
