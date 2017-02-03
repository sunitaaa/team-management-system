
package com.f1soft.team.management.system.daoo.impl;

import com.f1soft.team.management.system.dao.AdminDao;
import com.f1soft.team.management.system.entity.Admin;
import com.f1soft.team.management.system.repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sunita.joshi
 */
@Component

public class AdminDaoImpl implements AdminDao{

    private AdminRepository adminRepository;
    
    @Autowired
    public  AdminDaoImpl(AdminRepository adminRepository){
        this.adminRepository= adminRepository;
    }
    
    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }

    @Override
    public void addAdmin(Admin admin) {
       try {
            adminRepository.save(admin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    

