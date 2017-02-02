
package com.f1soft.team.management.system.dao;

import com.f1soft.team.management.system.entity.Admin;
import java.util.List;

/**
 *
 * @author sunita.joshi
 */
public interface AdminDao {
   List<Admin> findAll();

     void addAdmin(Admin admin);
    
}
