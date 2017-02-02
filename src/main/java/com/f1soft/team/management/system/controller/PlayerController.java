
package com.f1soft.team.management.system.controller;

import com.f1soft.team.management.system.entity.Player;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.management.system.request.dto.LoginRequestDTO;
import com.f1soft.team.managment.system.service.PlayerService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;
    
    @RequestMapping(value = "/player" , method = RequestMethod.GET)
    public ModelAndView displayPlayerPage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        ModelAndView modelAndView = new ModelAndView();
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO();
        modelAndView.addObject("loginRequestDTO", loginRequestDTO);
        modelAndView.setViewName("playerPage");
        return modelAndView;
    }    
    @RequestMapping(value = "/player/add", method = RequestMethod.GET)
     public ModelAndView addPlayerPage() {
        ModelAndView modelAndView = new ModelAndView(); 
        modelAndView.addObject("player", new Player());
        //set the location for page
        modelAndView.setViewName("addPlayer");
        return modelAndView;
    }
     
     @RequestMapping(value = "/player/add/process" , method = RequestMethod.POST)
     public String addingPlayer(@Valid Player player, BindingResult result, ModelMap map){
         if(result.hasErrors()){
             return "validation";
         }
         else{
             String message = "Player " + player.getFirstName() + " registered successfully";
             playerService.addPlayer(player);
             map.addAttribute("player", new Player());
             map.addAttribute("message", message);
             return "addPlayer";
         }
         
     }     
     
//    @RequestMapping(value = "/player/add/process", method = RequestMethod.POST)
//    public ModelAndView addingPlayer(@ModelAttribute Player player) {
//        ModelAndView modelAndView = new ModelAndView("addPlayer");
//        System.out.println("player obj:: :" + player);
//        playerService.addPlayer(player);
//         String message = "Player " + player.getFirstName() + " registered successfully";
//        // reset ko kaam garxa add team garda
//        modelAndView.addObject("player", new Player());
//        modelAndView.addObject("message", message);
//        return modelAndView;
//    }
    
    @RequestMapping(value = "/player/list", method = RequestMethod.GET)
    public ModelAndView listOfPlayers() {
        System.out.println("called:::");
        ModelAndView modelAndView = new ModelAndView("list");
        List<Player> players = playerService.getPlayers();
        System.out.println("players" + players.size());
        modelAndView.addObject("players", players);
        modelAndView.setViewName("listPlayer");
        return modelAndView;
    }
     @RequestMapping(value = "/player/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPlayerPage(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("editPlayer");
        Player player = playerService.getPlayer(id);
        modelAndView.addObject("player", player);
        return modelAndView;
    }
  
    @RequestMapping(value = "/player/edit/{id}", method = RequestMethod.POST)
    public ModelAndView edditingPlayer(@ModelAttribute Player player, @PathVariable Long id) {
        try {
            ModelAndView modelAndView = new ModelAndView();
            Player newPlayer = playerService.getPlayer(id);

            if (player != null) {

                newPlayer.setAge(player.getAge());
                newPlayer.setEmail(player.getEmail());
                newPlayer.setFirstName(player.getFirstName());
                newPlayer.setLastName(player.getLastName());
                newPlayer.setPassword(player.getPassword());
                playerService.updatePlayer(newPlayer);

            } else {
                String message = "Error while updating player";
            }
            String message = "Player was successfully edited.";
            List<Player> players = playerService.getPlayers();
            modelAndView.addObject("players", players);
            modelAndView.setViewName("listPlayer");
            //modelAndView.addObject("message", message);
            return modelAndView;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ModelAndView("home");
        }
    }
    
    
     @RequestMapping(value = "/player/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deletePlayer(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView();
        playerService.deletePlayer(id);
        String message = "Player was successfully deleted.";
        modelAndView.addObject("message", message);
        // return garxa   list lai euta row delete gare paxi 
        List<Player> players = playerService.getPlayers();
        System.out.println("players" + players.size());
        modelAndView.addObject("players", players);
        modelAndView.setViewName("listPlayer");
        return modelAndView;
    }
}