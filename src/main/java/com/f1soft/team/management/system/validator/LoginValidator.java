package com.f1soft.team.management.system.validator;

import com.f1soft.team.management.system.entity.Admin;
import com.f1soft.team.management.system.utility.Bcrypt;

/**
 *
 * @author sunita.joshi
 */
public class LoginValidator {
    
    public  static Boolean authenciateUser(Admin admin){
        System.out.println("Authenciation of user::::::::");
        
        return true;
    }
     public static Boolean checkPassword(String enteredPassword, String originalPassword) {
        System.out.println("Checking password");
        try {
            System.out.println("enteredPassword" + enteredPassword);
            System.out.println("originalPassword" + originalPassword);
            return Bcrypt.checkpw(enteredPassword, originalPassword);
        } catch (NullPointerException ex) {
            System.out.println("Exception occured!!");
            return false;
        }
     }
}

    

