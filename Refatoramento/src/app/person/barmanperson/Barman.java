package app.person.barmanperson;

import app.*;
import app.person.*;

public class Barman extends Person { 

    private String name;
    private String CPF;
    private String password;

    
    Barman(String name, String CPF){
        this.name = name;
        setCPF(CPF);
    }

    public Barman(String name){
        this.name = name;
    }

    /**
     * @param Name the name to set
     */
    @Override
    public void setName(String name){
        this.name = name;
    }

    /**
    * @return the name
    */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param CPF the cpf to set
     */
    @Override
    public void setCPF(String CPF){
        boolean checkCPF = ExceptionHandling.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
        }
        else {
            System.out.printf("Error !!!\n Try again\n CPF:\n");
            String cpf = ExceptionHandling.readString();
            setCPF(cpf);
        }
    }

     /**
     * @return the CPF
     */
    @Override
    public String getCPF(){
        return this.CPF;
    }

     /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }

     /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because Barman doesn't have permission to add people in this software
     */
    @Override
    public void add(){
        System.out.println("Sorry, but you can't do that!!!");
    }

    /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because Barman doesn't have permission to remove people in this software
     */
    @Override
    public void remove(){
        System.out.println("Sorry, but you can't do that!!!");
    }

    /** 
     * @return    The string with information about Barman
     */
    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print = print + " // CPF: " + imprimeCPF(this.CPF);
        }
        print += " // Type: Barman" + "\n";
        return print;
    }

}