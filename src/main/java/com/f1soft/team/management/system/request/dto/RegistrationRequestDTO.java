
package com.f1soft.team.management.system.request.dto;

import java.io.Serializable;

/**
 *
 * @author sunita.joshi
 */
public class RegistrationRequestDTO  implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Character  roles;

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
