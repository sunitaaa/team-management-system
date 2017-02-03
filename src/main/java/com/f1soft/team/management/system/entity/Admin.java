
package com.f1soft.team.management.system.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

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
    
    @Column(name = "createdById" )
    private Long createdById;
    
    @NotNull
    @Length(max=50)
    @NotEmpty(message = "Please enter your firstname")
    @Column(name = "firstName" )
    private String firstName;
    
    @NotNull
    @Length(max = 50)
    @NotEmpty(message = "Please enter your lastname")
    @Column(name = "lastName")
    private String lastName;
    
    @NotNull
    @NotEmpty(message = "please enter your email")
    @Column(name = "email")
    private String email;
    
    @NotNull
    @NotEmpty(message = "Please enter your password")
    @Column(name = "password")
    private String password;
      
    @NotNull
    @NotEmpty(message = "Please select a  role")
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
