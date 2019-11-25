package app;

import java.util.ArrayList;

class Login {
    private String adminLogin = "adm123";
    private String passwordAdmin = "adm123";
    public ArrayList<Person> list = new ArrayList<Person>(); // Need to know when login how many persons in this system
                                                      // Check if InstanceOf solution the problem about type of class in array
    public ArrayList<Drinks> drinks = new ArrayList<Drinks>();

    public String toString(){
        return "halla1";
    }

    public Person signIn(){
        Admin person = new Admin(adminLogin);
        return person;
    }

    public String signOut(){
        
        return "0";
    }
}