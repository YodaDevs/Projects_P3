package app;

import java.util.ArrayList;
import java.util.Scanner;

class Login {
    private String adminLogin = "123";
    private String passwordAdmin = "123";

    private ArrayList<Person> list = new ArrayList<Person>(); // Need to know when login how many persons in this system
                                                      // Check if InstanceOf solution the problem about type of class in array
    public ArrayList<Drinks> drinks = new ArrayList<Drinks>();

    public ArrayList<Person> getList() {
        return list;
    }

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

    public Person getUserFromTheList(String cpf, String password){
        for(Person person : list){
            if(person.getCPF().equals(cpf) && person.getPassword().equals(password)){
                return person;
            }
        }
        return null;
    }

    public void printArray(ArrayList<Person> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
        }
    }

    public void printArrayDrinks(ArrayList<Drinks> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
        }
    }
}