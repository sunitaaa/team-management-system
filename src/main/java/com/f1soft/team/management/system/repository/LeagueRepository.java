
package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.League;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sunita.joshi
 */
public interface LeagueRepository extends JpaRepository<League, Long>{
    
}
