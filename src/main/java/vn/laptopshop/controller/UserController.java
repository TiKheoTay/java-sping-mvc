package vn.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.laptopshop.domain.User;
import vn.laptopshop.service.UserService;

@Controller

public class UserController {
    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //@RequestMapping("")
    //public String getHomePage(Model model) {
    //String test = this.userService.handdleHello();
    //model.addAttribute("olala", test);
    //return "hello";
    //}

    @RequestMapping("/admin/user")

    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }


    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User pvt) {
        System.out.println(pvt);
        return "hello";
    }
}
