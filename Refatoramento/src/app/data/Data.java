package app.data;

import java.util.ArrayList;
import app.*;
import app.views.loginscreen.LoginStrategy;

public class Data {

    private ArrayList<LoginStrategy> list = null;                                                      
    private ArrayList<Drinks> drinks = null;
    private static Data single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private Data() { 
        list = new ArrayList<LoginStrategy>();                                                      
        drinks = new ArrayList<Drinks>();
    } 
  
    // static method to create instance of Singleton class 
    public static Data getInstance() { 

        if (single_instance == null) 
            single_instance = new Data(); 

        return single_instance; 
    } 

    /**
     * @return the List
     */
    public ArrayList<LoginStrategy> getPersonList() {
        return this.list;
    }

    /**
     * @return the List of drinks
     */
    public ArrayList<Drinks> getDrinksList() {
        return this.drinks;
    }

    /** 
     * @param list      List of drinks
     * @return          Void, because we just need to show all information about drinks
     */
    public void printArrayDrinks(ArrayList<Drinks> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
            System.out.println();
        }
    }

    //need to change Person to LoginStrategy
    public LoginStrategy getUserFromTheList(String cpf, String password){

        for(LoginStrategy person : getPersonList()) {
            /*if(person.getCPF().equals(cpf) && person.getPassword().equals(password)){
                return person;
            }*/
        }
        return null;
    }

}