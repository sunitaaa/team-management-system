package com.f1soft.team.management.system.controller;

import com.f1soft.team.management.system.dao.TeamDao;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.management.system.request.dto.LoginRequestDTO;
import com.f1soft.team.managment.system.service.TeamService;
import java.lang.reflect.Method;
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
public class TeamController {

    @Autowired
    private TeamService teamService;

    
    @Autowired
    private HttpSession httpSession;
    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public ModelAndView displayTeamPage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        ModelAndView model = new ModelAndView();
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO();
        model.addObject("loginRequestDTO", loginRequestDTO);
        model.setViewName("teamPage");
        return model;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logOutPage() {
        ModelAndView modelAndView = new ModelAndView();
        httpSession.invalidate();
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO();
        modelAndView.addObject("loginRequestDTO", loginRequestDTO);
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "/team/add", method = RequestMethod.GET)
    public ModelAndView addTeamPage() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("team", new Team());
        //set the location for page
        modelAndView.setViewName("addTeam");
        return modelAndView;
    }

    @RequestMapping(value = "/team/add/process", method = RequestMethod.POST)
    public String addingTeam(@Valid Team team, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            return "validation";
        } else {
            String message = "Team " + team.getTeamName() + " registered successfully";
            map.addAttribute("message", "Dear " + team.getPlayerName() + " , your Registration completed successfully");
            teamService.addTeam(team);
            map.addAttribute("team", new Team());
            
            map.addAttribute("message", message);
            return "addTeam";

        }
    }

//    @RequestMapping(value = "/team/add/process", method = RequestMethod.POST)
//    public ModelAndView addingTeam(@ModelAttribute Team team  ) {
//        ModelAndView modelAndView = new ModelAndView("addTeam");
//        System.out.println("team obj:: :" + team);
//        teamService.addTeam(team);
//         String message = "Team " + team.getTeamName() + " registered successfully";
//        // reset ko kaam garxa add team garda
//        modelAndView.addObject("team", new Team());
//        modelAndView.addObject("message", message);
//
//        return modelAndView;
//    }
    @RequestMapping(value = "/team/list", method = RequestMethod.GET)
    public ModelAndView listOfTeams() {
        System.out.println("called:::");
        ModelAndView modelAndView = new ModelAndView("list");
        List<Team> teams = teamService.getTeams();
        System.out.println("teams" + teams.size());
        modelAndView.addObject("teams", teams);
        modelAndView.setViewName("listTeam");
        return modelAndView;
    }

    @RequestMapping(value = "/team/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editTeamPage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("editTeam");
        Team team = teamService.getTeam(id);
        modelAndView.addObject("team", team);
        return modelAndView;
    }

    @RequestMapping(value = "/team/edit/{id}", method = RequestMethod.POST)
    public ModelAndView edditingTeam(@ModelAttribute Team team, @PathVariable Long id) {
        try {
            ModelAndView modelAndView = new ModelAndView();
            Team newTeam = teamService.getTeam(id);

            if (team != null) {

                newTeam.setPlayerName(team.getPlayerName());
                newTeam.setTeamName(team.getTeamName());
                newTeam.setTeamManager(team.getTeamManager());
                teamService.updateTeam(newTeam);

            } else {
                String message = "Error while updating team";
            }
            String message = "Team was successfully edited.";
            List<Team> teams = teamService.getTeams();
            modelAndView.addObject("teams", teams);
            modelAndView.setViewName("listTeam");
            //modelAndView.addObject("message", message);
            return modelAndView;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ModelAndView("home");
        }
    }

    @RequestMapping(value = "/team/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTeam(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        teamService.deleteTeam(id);
        String message = "Team was successfully deleted.";
        modelAndView.addObject("message", message);
        // return garxa   list lai euta row delete gare paxi 
        List<Team> teams = teamService.getTeams();
        System.out.println("teams" + teams.size());
        modelAndView.addObject("teams", teams);
        modelAndView.setViewName("listTeam");
        return modelAndView;
    }

}
