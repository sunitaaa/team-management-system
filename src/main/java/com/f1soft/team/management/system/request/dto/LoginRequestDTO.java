
package com.f1soft.team.management.system.request.dto;

import java.io.Serializable;

/**
 *
 * @author sunita.joshi
 */
public class LoginRequestDTO  implements Serializable{
    
    private String email;
    private String password;

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
    
    
    
}
