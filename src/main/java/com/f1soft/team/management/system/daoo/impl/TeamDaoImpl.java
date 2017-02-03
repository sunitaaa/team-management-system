package com.f1soft.team.management.system.daoo.impl;

import com.f1soft.team.management.system.dao.TeamDao;
import com.f1soft.team.management.system.entity.Team;
import com.f1soft.team.management.system.repository.TeamRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunita.joshi
 */
@Repository
public class TeamDaoImpl implements TeamDao {

    private final TeamRepository teamRepository;

    //making repository constructor autowired
    @Autowired
    public TeamDaoImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;

    }

    @Override
    public void addTeam(Team team) {
        try {
            teamRepository.save(team);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateTeam(Team team) {
        teamRepository.save(team);
    }

    @Override
    public Team getTeam(Long id) {
        return teamRepository.findOne(id);

    }

    @Override
    public void deleteTeam(Long id) {
        Team team = getTeam(id);
        if (team != null) {
            teamRepository.delete(team);

        }
    }

    @Override
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team findById(Long teamId) {
        return teamRepository.findOne(teamId);
    }

}
