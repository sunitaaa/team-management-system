
package com.f1soft.team.management.system.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sunita.joshi
 */
@Entity
@Table(name = "admin")
public class Admin  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;
    
    @NotNull
    @Column(name = "firstName")
    private String firstName;
    
    @NotNull
    @Column(name = "lastName")
    private String lastName;
    
    @NotNull
    @Column(name = "email")
    private String email;
    
    @NotNull
    @Column(name = "password")
    private String password;
      
    @NotNull
    @Column(name = "roles")
    private Character roles;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getRoles() {
        return roles;
    }

    public void setRoles(Character roles) {
        this.roles = roles;
    }
    
  

    
    
    
    
    
}
