
package com.f1soft.team.management.system.daoo.impl;

import com.f1soft.team.management.system.dao.LeagueDao;
import com.f1soft.team.management.system.entity.League;
import com.f1soft.team.management.system.repository.LeagueRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunita.joshi
 */

@Component
public class LeagueDaoImpl implements LeagueDao{
  
    private LeagueRepository leagueRepository;
    @Autowired
    public LeagueDaoImpl(LeagueRepository leagueRepository){
        this.leagueRepository= leagueRepository;
    }

    @Override
    public void addLeague(League league) {
        try{
           
        leagueRepository.save(league );
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    @Override
    public void updateLeague(League league) {
        leagueRepository.save(league);
    }

    @Override
    public League getLeague(Long id) {
        return leagueRepository.findOne(id);
        
    }

    @Override
    public void deleteLeague(Long id) {
        League league = getLeague(id);
        if(league!=null){
            leagueRepository.delete(league);
            
        }
    }

    @Override
    public List<League> getLeagues() {
        
        return leagueRepository.findAll();
    }

    @Override
    public League findById(Long leagueId) {
       return leagueRepository.findOne(leagueId);
    }
    
}
