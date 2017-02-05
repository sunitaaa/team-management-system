package com.f1soft.team.management.system.controller;

import com.f1soft.team.management.system.entity.Admin;
import com.f1soft.team.management.system.request.dto.LoginRequestDTO;
import com.f1soft.team.management.system.validator.LoginValidator;
import com.f1soft.team.managment.system.service.AdminService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sunita.joshi
 */
@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

//    @Autowired
//    private HttpSession httpSession;
    private Admin admin;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView displayLogin(HttpServletRequest httpServletRequest,
            HttpSession httpSession
    ) {
        ModelAndView model = new ModelAndView();
        Object attribute = httpSession.getAttribute("adminId");
        if (attribute != null) {
            model = new ModelAndView("home");
            model.addObject("admin", admin);

            return model;
        } else {
            LoginRequestDTO loginRequestDTO = new LoginRequestDTO();
            model.addObject("loginRequestDTO", loginRequestDTO);
            model.setViewName("login");
            return model;
        }

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            HttpSession httpSession,
            @ModelAttribute("loginRequestDTO") @Valid LoginRequestDTO loginRequestDTO, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView();
        if (bindingResult.hasErrors()) {
            
         model.addObject("error", "Login Failed!!!!"
                 + "<br>  Reason Bad Credentials...");
         model.setViewName("login");
        }
        Admin admin = adminService.findAdminInfoByEmail(loginRequestDTO.getEmail());
        if (admin != null) {
            if (LoginValidator.checkPassword(loginRequestDTO.getPassword(), admin.getPassword())) {
                httpServletRequest.setAttribute("logged in user", loginRequestDTO.getEmail());

                // checking for super admin and admin
                httpSession.setAttribute("adminId", admin.getAdminId());
                httpSession.setAttribute("role", admin.getRoles());
                //to remove all the data from the session 
                //httpSession.invalidate();
                System.out.println("valid user");

                httpSession.setAttribute("adminId", admin.getAdminId());
                model = new ModelAndView("home");
                model.addObject("admin", admin);
            } else {
                //model.addObject("loginRequestDTO", loginRequestDTO);

//                model.setViewName("error");
                 model.addObject("error", "Login Failed!!!!"
                 + "Reason Bad Credentials...");

            }
        } else {
            // model.addObject("loginRequestDTO", loginRequestDTO);

//            model.setViewName("error");
                model.addObject("error", "Login Failed!!!!"
                 + "Reason Bad Credentials...");
        }

        return model;
    }

}
