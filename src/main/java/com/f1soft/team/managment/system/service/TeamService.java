
package com.f1soft.team.managment.system.service;

import com.f1soft.team.management.system.entity.Team;
import java.util.List;

/**
 *
 * @author sunita.joshi
 */
 public interface TeamService {

     void addTeam(Team team);

     List<Team> getTeams();

     Team getTeam(Long id);

     void updateTeam(Team team);

     void deleteTeam(Long id);
    
}
