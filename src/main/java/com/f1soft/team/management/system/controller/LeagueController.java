package com.f1soft.team.management.system.controller;

import com.f1soft.team.management.system.entity.League;

import com.f1soft.team.management.system.request.dto.LoginRequestDTO;

import com.f1soft.team.managment.system.service.LeagueService;
import java.util.ArrayList;
import static java.util.Arrays.fill;
import static java.util.Arrays.fill;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sunita.joshi
 */
@Controller
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value = "/league", method = RequestMethod.GET)
    public ModelAndView displayLeaguePage(HttpServletRequest httpServletRequest) {
        ModelAndView model = new ModelAndView();
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO();
        model.addObject("loginRequestDTO", loginRequestDTO);
        model.setViewName("leaguePage");
        return model;
    }

    @RequestMapping(value = "/league/add", method = RequestMethod.GET)
    public ModelAndView addLeaguePage() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("league", new League());
        //set the location for page
        model.setViewName("addLeague");
        return model;
    }

    @RequestMapping(value = "/league/add/process", method = RequestMethod.POST)
    public ModelAndView addingLeague(@Valid League league, BindingResult result) {
        // for validation
        ModelAndView modelAndView = new ModelAndView();
        if (result.hasErrors()) {
            System.out.println("called");
            //map.addAttribute("error", "Please fill all the fields");
            modelAndView.setViewName("addLeague");
            modelAndView.addObject("error", "Please fiil the fields");
        } else {
            String message = "League was succesfully added";
            league.setCreatedById(Long.valueOf(httpSession.getAttribute("adminId").toString()));
            leagueService.addLeague(league);
            modelAndView.addObject("league", new League());
            modelAndView.setViewName("addLeague");

            // map.addAttribute("league", new League());
            // return "addLeague";
        }
        return modelAndView;
    }

    //<-----UPDATE LEAGUELIST------>
    @RequestMapping(value = "/league/list", method = RequestMethod.GET)
    public ModelAndView listOfLeagues() {
        try {
            System.out.println("called:::");
            ModelAndView modelAndView = new ModelAndView();
            List<League> leagues = new ArrayList<>();
            if (httpSession.getAttribute("role").equals('S')) {
                leagues = leagueService.getLeagues();

            } else if (httpSession.getAttribute("role").equals('A')) {
                leagues = leagueService.getLeagues(Long.valueOf(httpSession.getAttribute("adminId").toString()));

            } else {
                modelAndView.addObject("error", "Please check the required fields");
            }
            System.out.println("league" + leagues.size());
            //object lai liyara view ma send garne add object le garxcxa

            modelAndView.addObject("leagues", leagues);
            modelAndView.addObject("error", "Please check the required fields");
            modelAndView.setViewName("listLeague");
            //redirect garxa kun page ma jane vanera 
            // modelAndView.setViewName("listLeague");
            return modelAndView;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return new ModelAndView("home");
    }

    // <-------DELETE LEAGUE LIST--------->
    @RequestMapping(value = "/league/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editLeaguePage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("editLeague");
        League league = leagueService.getLeague(id);
        modelAndView.addObject("league", league);
        return modelAndView;
    }

    @RequestMapping(value = "/league/edit/{id}", method = RequestMethod.POST)
    public ModelAndView editingLeague(@ModelAttribute League league, @PathVariable Long id) {

        try {
            ModelAndView modelAndView = new ModelAndView();
            League newLeague = leagueService.getLeague(id);

            if (league != null) {

                newLeague.setCountryName(league.getCountryName());
                newLeague.setLeagueManager(league.getLeagueManager());
                newLeague.setLeagueName(league.getLeagueName());
                leagueService.updateLeague(newLeague);

            } else {
                
                modelAndView.addObject("error", "fields cannot be blank");
                String message = "Error while updating league";
            }

            List<League> leagues = new ArrayList<>();
            if (httpSession.getAttribute("role").equals('S')) {
                leagues = leagueService.getLeagues();

            } else if (httpSession.getAttribute("role").equals('A')) {
                leagues = leagueService.getLeagues(Long.valueOf(httpSession.getAttribute("adminId").toString()));

            }
            String message = "League was succesfully edited";
            modelAndView.addObject("leagues", leagues);
            modelAndView.setViewName("listLeague");
            return modelAndView;

        } catch (Exception ex) {
            ex.printStackTrace();
            return new ModelAndView("home");
        }

    }

    @RequestMapping(value = "/league/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteLeague(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        leagueService.deleteLeague(id);
        String message = "LEague was successfully deleted.";
        modelAndView.addObject("message", message);
        List<League> leagues = new ArrayList<>();
        if (httpSession.getAttribute("role").equals('S')) {
            leagues = leagueService.getLeagues();

        } else if (httpSession.getAttribute("role").equals('A')) {
            leagues = leagueService.getLeagues(Long.valueOf(httpSession.getAttribute("adminId").toString()));

        }

        modelAndView.addObject("leagues", leagues);
        modelAndView.setViewName("listLeague");
        return modelAndView;

    }
}
