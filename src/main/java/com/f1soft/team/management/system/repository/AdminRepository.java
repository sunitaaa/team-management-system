
package com.f1soft.team.management.system.repository;

import com.f1soft.team.management.system.entity.Admin;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sunita.joshi
 */
public interface AdminRepository  extends  JpaRepository<Admin, Long>{

     Admin findAdminInfoByEmail(String email);
    
}
