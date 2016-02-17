/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.api.UserSI;
import com.common.BusinessResult;
import com.to.UserTO;

/**
 * @author amodak
 */
@Controller
@SessionAttributes("user")
public class UserController {

    @Autowired
    UserSI userSI;

    @RequestMapping(value = "/index.html")
    public ModelAndView student() {
        return new ModelAndView("login", "command", new UserTO());
    }

    @RequestMapping(value = "/checkuser.html", method = RequestMethod.POST)
    public ModelAndView loginUser(@ModelAttribute("command") UserTO user, BindingResult bindingResult) {
        ModelAndView modelAndView;
        BusinessResult<UserTO> businessResult = userSI.getUserInfo(user.getUserName(), user.getUserPassword());
        if (businessResult.isValid()) {
            modelAndView = new ModelAndView("index", "user", businessResult.getResult());
        } else {
            modelAndView = new ModelAndView("login-fail", "message", businessResult.getMessages().get(0));
        }
        return modelAndView;
    }

}
