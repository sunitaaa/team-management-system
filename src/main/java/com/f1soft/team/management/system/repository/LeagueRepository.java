package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.League;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sunita.joshi
 */
public interface LeagueRepository extends JpaRepository<League, Long> {

    List<League> findByCreatedById(long id);
}
