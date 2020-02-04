package app.data;

import app.*;

public class UserSingleton {

    private Person user = null;    
    private static UserSingleton single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private UserSingleton() { 

    } 
  
    // static method to create instance of Singleton class 
    public static UserSingleton getInstance() { 

        if (single_instance == null){ 
            single_instance = new UserSingleton();
        }
        return single_instance; 
    } 

    

    /**
     * @return the user
     */
    public Person getUser() {
        return user;
    }

    public void setUser( Person uPerson){
        this.user = uPerson;
    }

    public void cleanUserSingleton(){
        UserSingleton.single_instance = null;
    }

}