/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author nguye
 */
public class UserLogin {
    private String user;
    private String pass;

    public UserLogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public UserLogin() {
        user = "";
        pass = "";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
   
}
