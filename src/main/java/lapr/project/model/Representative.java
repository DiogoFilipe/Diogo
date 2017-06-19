/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Diogo
 */
public class Representative extends User{
    
    /**
     * 
     * @param user real name
     * @param username name in the platform
     * @param email his email
     * @param password string that protect his account
     */
    public Representative(String user,String username,String email,String password){
        super(user,username,email,password);
    }
    
    /**
     * empty constructor 
     */
   public Representative(){
        super();
    }

    @Override
    public String getEmail() {
        return super.getEmail(); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public String getUsername() {
        return super.getUsername(); 
    }

    @Override
    public String getName() {
        return super.getName(); 
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email); 
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public void setName(String name) {
        super.setName(name); 
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); 
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
