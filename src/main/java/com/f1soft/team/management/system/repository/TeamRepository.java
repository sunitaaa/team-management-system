
package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.Team;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sunita.joshi
 */
public interface TeamRepository extends JpaRepository<Team, Long>{
    
}
