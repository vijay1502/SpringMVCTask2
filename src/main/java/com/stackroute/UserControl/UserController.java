package com.stackroute.UserControl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Scanner;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
   public String user(@RequestParam("username")String username,@RequestParam("password")String password, ModelMap modelMap){
        User user=new User();

        String output;
        user.setName(username);
        modelMap.addAttribute("result",user.getName());
        if(user.getName()==user.getPassword()){
            output="display";
        }
        else {output="wronglogin";}
    return "display";}
}
