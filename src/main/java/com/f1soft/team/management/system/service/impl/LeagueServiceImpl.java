package com.f1soft.team.management.system.service.impl;

import com.f1soft.team.management.system.dao.LeagueDao;
import com.f1soft.team.management.system.entity.League;
import com.f1soft.team.management.system.repository.LeagueRepository;
import com.f1soft.team.managment.system.service.LeagueService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sunita.joshi
 */
@Component
public class LeagueServiceImpl implements LeagueService {

    @Autowired
    private LeagueDao leagueDao;

    @Autowired
    private LeagueRepository leagueRepository;

    @Override
    public void addLeague(League league) {
        leagueDao.addLeague(league);
    }

    @Override
    public List<League> getLeagues() {
        return leagueDao.getLeagues();
    }

    @Override
    public League getLeague(Long id) {
        return leagueDao.getLeague(id);
    }

    @Override
    public void updateLeague(League league) {
        leagueDao.updateLeague(league);
    }

    @Override
    public void deleteLeague(Long id) {
        leagueDao.deleteLeague(id);
    }

    @Override
    public List<League> getLeagues(long id) {
        return leagueRepository.findByCreatedById(id);
    }

}
