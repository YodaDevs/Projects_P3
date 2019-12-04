package app;

import java.util.ArrayList;
import java.util.Scanner;
import app.persontypes.*;

public class Login {
    private String adminLogin = "123";
    private String passwordAdmin = "123";

    private ArrayList<Person> list = new ArrayList<Person>();                                                      
    public ArrayList<Drinks> drinks = new ArrayList<Drinks>();

    /**
     * @return the List
     */
    public ArrayList<Person> getList() {
        return list;
    }

    /** 
     * @return  the Person, because depending on the person, you will have your permission level
     */
    public Person signIn(){
        Scanner input = new Scanner(System.in);
        System.out.println("CPF:");
        String login = input.nextLine();
        System.out.println("Password:");
        String password = input.nextLine();

        if(login.equals(this.adminLogin) && password.equals(this.passwordAdmin)){
            Admin person = new Admin(adminLogin);
            return person;
        }
        else if(!(list.isEmpty())){
            Person user = getUserFromTheList(login, password);
            return user;
        }

        return null;
    }

    /** 
     * @return  the Person, because need to check if this person is at our list
     */
    public Person getUserFromTheList(String cpf, String password){
        for(Person person : list){
            if(person.getCPF().equals(cpf) && person.getPassword().equals(password)){
                return person;
            }
        }
        return null;
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

    public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }
}