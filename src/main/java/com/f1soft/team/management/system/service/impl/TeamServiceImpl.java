
package com.f1soft.team.management.system.service.impl;

import com.f1soft.team.management.system.dao.TeamDao;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.managment.system.service.TeamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunita.joshi
 */
@Service
@Transactional
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamDao teamDao;

    public void addTeam(Team team) {
        teamDao.addTeam(team);      
    }
 
    public void updateTeam(Team team) {
        teamDao.updateTeam(team);
    }
 
    public Team getTeam(Long id) {
        return teamDao.getTeam(id);
    }
 
    public void deleteTeam(Long id) {
        teamDao.deleteTeam(id);
    }
 
    public List<Team> getTeams() {
        return teamDao.getTeams();
    }

    
        
    }

    
 

