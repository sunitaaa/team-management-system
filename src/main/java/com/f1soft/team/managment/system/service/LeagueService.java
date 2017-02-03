package com.f1soft.team.managment.system.service;

import com.f1soft.team.management.system.entity.League;

import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface LeagueService {

    void addLeague(League league);

    List<League> getLeagues();

    List<League> getLeagues(long id);

    League getLeague(Long id);

    void updateLeague(League league);

    void deleteLeague(Long id);

}
