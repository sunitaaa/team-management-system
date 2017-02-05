package com.f1soft.team.management.system.controller;

import com.f1soft.team.management.system.entity.Admin;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.management.system.request.dto.LoginRequestDTO;
import com.f1soft.team.management.system.request.dto.RegistrationRequestDTO;
import com.f1soft.team.management.system.utility.Bcrypt;
import com.f1soft.team.managment.system.service.AdminService;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mysql.jdbc.Util;
import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sunita.joshi
 */
@Controller

public class AdminController {

    @Autowired
    private AdminService adminService;

    private Admin admin;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView displayLogin(HttpServletRequest httpServletRequest) {
        ModelAndView model = new ModelAndView();
        RegistrationRequestDTO registrationRequestDTO = new RegistrationRequestDTO();
        model.addObject("registrationRequestDTO", registrationRequestDTO);
        model.setViewName("registration");
        return model;
    }

    @RequestMapping(value = "/addAdmin", method = RequestMethod.GET)
    public ModelAndView addAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("admin", new Admin());
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/addAdmin/process", method = RequestMethod.POST)
    public String addAdminPage(@ModelAttribute Admin admin ) {
        ModelAndView modelAndView = new ModelAndView("login");
        // to decrypt password
        admin.setPassword(Bcrypt.hashpw(admin.getPassword(), Bcrypt.gensalt()));
        adminService.addAdmin(admin);
        modelAndView.addObject("admin", new Admin());
        modelAndView.setViewName("login");
        return "redirect:/";
    }

}
