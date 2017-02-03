
package com.f1soft.team.management.system.service.impl;

import com.f1soft.team.management.system.dao.PlayerDao;
import com.f1soft.team.management.system.entity.Player;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.management.system.repository.PlayerRepository;
import com.f1soft.team.managment.system.service.PlayerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunita.joshi
 */
@Component
public class PlayerServiceImpl implements PlayerService{
     @Autowired
    private PlayerDao playerDao;
     
     @Autowired
     private PlayerRepository playerRepository;

    @Override
    public void addPlayer(Player player) {
        playerDao.addPlayer(player);
    }

   
    @Override
    public List<Player> getPlayers() {
        return playerDao.getPlayers();
    }

    @Override
    public Player getPlayer(Long id) {
        return playerDao.getPlayer(id);
    }

    @Override
    public void updatePlayer(Player player) {
       playerDao.updatePlayer(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerDao.deletePlayer(id);
    }

    @Override
    public Player findCreatedById(Long createdById) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Player> getPlayers(long id) {
        return playerRepository.findByCreatedById(id);
    }
    
}
    

  
