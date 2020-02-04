package app.person.adminperson;

import java.util.ArrayList;

import app.*;
import app.person.*;

public abstract class AdminAbstract extends Person {

    public String name;
    public String CPF;
    public String password;

    public final void preparar(){ /* O TEMPLATE METHOD */
        
    }
    /**
     * @return the name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cpf
     */
    @Override
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the cpf to set
     */
    @Override
    public void setCPF(String CPF) {
        boolean checkCPF = ExceptionHandling.isCPF(CPF);
        if (checkCPF) {
            this.CPF = CPF;
        } else {
            System.out.printf("Error !!!\n Try again\n CPF:\n");
            String cpf = ExceptionHandling.readString();
            setCPF(cpf);
        }
    }

    public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    /** 
     * @param objPerson   Object of type Person that we set name,cpf,password and if an client, we set favorite drinks
     * @param listA       This list is our ArrayList of persons, that can be Client,Admin,Barman and Security Guard
     * @return            Void, because we just need to add all the information at list, if we need some information, we check at the list
     */
    @Override
    public void add() {
    }

    /** 
     * @return  The string with information about Admin
     */
    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print += " // CPF: " + imprimeCPF(this.CPF);
        }
        print += " Type: Admin";
        return print;
    }

    /** 
     * @param Person      Person of type String is the name of person that you want to remove
     * @param listA       this is the list that you want to use to remove Person
     * @return            Void, because we just need to remove from the list
     */
    @Override
    public void remove() {
    }

    /** 
     * @param drinks      this is the list that you want to show all drinks information
     * @param people      this is the list that you want to show people information
     * @return            Void, because we just need the list to show all information about drinks and people
     */
    public void reportData(ArrayList<Drinks> drinks, ArrayList<Person> people){
        System.out.println("\n------------------------");
        System.out.println("\nAll drinks that we have:\n");
        if(drinks.isEmpty()) System.out.println("Sorry, we will add later");
        else{
            for(Drinks drinksA : drinks){
                System.out.println(drinksA.toString());
            }
        }
        System.out.println("\n------------------------");
        System.out.println("\nAll People Registered that we have:\n");
        if(people.isEmpty()) System.out.println("Sorry, we will add more people later");
        else {
            for(Person peopleA : people){
                System.out.println(peopleA.toString());
            }
        }
        System.out.println("\nEnd of Report, thank you");
        System.out.println("\n------------------------");
    }
}