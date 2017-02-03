
package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.League;
import com.f1soft.team.management.system.entity.Player;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sunita.joshi
 */
public interface PlayerRepository extends JpaRepository<Player, Long>{
    List<Player> findByCreatedById(long id);
    
}
