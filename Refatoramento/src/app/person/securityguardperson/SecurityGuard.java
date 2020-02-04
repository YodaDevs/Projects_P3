package app.person.securityguardperson;

import app.*;
import app.person.*;

public class SecurityGuard extends Person {
    
    private String name;
    private String CPF;
    private String password;

    
    SecurityGuard(String name, String CPF){
        this.name = name;
        this.CPF = CPF;
    }
    
    public SecurityGuard(String name){
        this.name = name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name){
        this.name = name;
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
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

     /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }

     /**
     * @return the name
     */
    @Override
    public String getName() {
        return this.name;
    }

     /**
     * @return the cpf
     */
    @Override
    public String getCPF(){
        return this.CPF;
    }

    /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because Security Guard doesn't have permission to add people in this software
     */
    @Override
    public void add(){
        System.out.println("Sorry, but you can't do that!!!");
    }

    /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because Security Guard doesn't have permission to remove people in this software
     */
    @Override
    public void remove(){
        System.out.println("Sorry, but you can't do that!!!");
    }

    /** 
     * @return    The string with information about Security Guard
     */
    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print = print + " // CPF: " + imprimeCPF(this.CPF);
        }
        print += " // Type: SecurityGuard" + "\n";
        return print;
    }

}