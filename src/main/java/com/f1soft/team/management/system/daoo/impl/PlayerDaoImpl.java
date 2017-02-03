
package com.f1soft.team.management.system.daoo.impl;

import com.f1soft.team.management.system.dao.PlayerDao;
import com.f1soft.team.management.system.entity.Player;
import com.f1soft.team.management.system.repository.PlayerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunita.joshi
 */
@Component
public class PlayerDaoImpl implements  PlayerDao{
    
    private PlayerRepository playerRepository;
    @Autowired
    public PlayerDaoImpl(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }
    
    
    

    @Override
    public void addPlayer(Player player) {
        try {
            playerRepository.save(player);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    @Override
    public void updatePlayer(Player player) {
     playerRepository.save(player);
        
    }

    @Override
    public void deletePlayer(Long id) {
         Player player = getPlayer(id);
        if(player!=null){
            playerRepository.delete(player);
            
        }
    }
    

    @Override
    public Player getPlayer(Long id) {
        return playerRepository.findOne(id);
    }

    @Override
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }
    
}