
package com.f1soft.team.managment.system.service;

import com.f1soft.team.management.system.entity.Admin;

/**
 *
 * @author sunita.joshi
 */
public interface AdminService {

    Admin findAdminInfoByEmail(String email);

     void addAdmin(Admin admin);
    
}
