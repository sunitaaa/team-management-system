
package com.f1soft.team.managment.system.service;

import com.f1soft.team.management.system.entity.Player;
import com.f1soft.team.management.system.entity.Team;
import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface PlayerService {

    
      void addPlayer(Player player);

     List<Player> getPlayers();

     Player getPlayer(Long id);

     void updatePlayer(Player player);

     void deletePlayer(Long id);
    
   
}
