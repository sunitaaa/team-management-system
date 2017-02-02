
package com.f1soft.team.management.system.dao;

import com.f1soft.team.management.system.entity.League;

import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface LeagueDao {
    
     void addLeague(League league);

     void updateLeague(League league);

     League getLeague(Long  id);

     void deleteLeague(Long id);

     List<League> getLeagues();

     League findById(Long leagueId);
    
}
