
package com.f1soft.team.management.system.dao;

import com.f1soft.team.management.system.entity.Player;
import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface PlayerDao {
    void addPlayer(Player player);

     void updatePlayer(Player player);

     void deletePlayer(Long id);

     Player getPlayer(Long id);

     List<Player> getPlayers();
}
