
package com.f1soft.team.management.system.dao;

import com.f1soft.team.management.system.entity.Team;
import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface TeamDao {

     void addTeam(Team team);

     void updateTeam(Team team);

     Team getTeam(Long  id);

     void deleteTeam(Long id);

     List<Team> getTeams();

     Team findById(Long teamId);
    
}
