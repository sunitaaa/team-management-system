
package com.f1soft.team.management.system.service.impl;

import com.f1soft.team.management.system.dao.AdminDao;
import com.f1soft.team.management.system.entity.Admin;
import com.f1soft.team.management.system.repository.AdminRepository;
import com.f1soft.team.managment.system.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunita.joshi
 */
@Component
public class AdminServiceImpl implements  AdminService{
    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin findAdminInfoByEmail(String email) {
        System.out.println("Checking Email:::::::::");
        return adminRepository.findAdminInfoByEmail(email);
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDao.addAdmin(admin);
        
    }
    
}
