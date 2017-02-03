
package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.League;
import com.f1soft.team.management.system.entity.Team;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sunita.joshi
 */
@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
    
    List<Team> findByCreatedById(long id);
    
}
