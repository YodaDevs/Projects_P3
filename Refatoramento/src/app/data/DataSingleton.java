package app.data;

import java.util.ArrayList;
import app.*;

public class DataSingleton {

    public ArrayList<Person> list = new ArrayList<Person>();                                                      
    public ArrayList<Drinks> drinks = new ArrayList<Drinks>();
    private static DataSingleton single_instance = null; 
    public FakeData fakeD = new FakeData();
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private DataSingleton() { 
        
    } 
  
    // static method to create instance of Singleton class 
    public static DataSingleton getInstance() { 

        if (single_instance == null){ 
            single_instance = new DataSingleton();
        }
        return single_instance; 
    } 

    /**
     * @return the List
     */
    public ArrayList<Person> getPersonList() {
        return this.list;
    }

    /**
     * @return the List of drinks
     */
    public ArrayList<Drinks> getDrinksList() {
        return this.drinks;
    }

    public void fakeData(){
        fakeD.generateData(single_instance);
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

    public Person getUserFromTheList(String cpf, String password){

        for(Person person : getPersonList()) {
            if(person.getCPF().equals(cpf) && person.getPassword().equals(password)){
                return person;
            }
        }
        return null;
    }

}