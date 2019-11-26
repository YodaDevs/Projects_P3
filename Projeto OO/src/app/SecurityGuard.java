package app;

import java.util.ArrayList;
import java.util.Scanner;

class SecurityGuard extends Login implements Person{
    
    private String name;
    private String CPF;
    private String password;

    
    SecurityGuard(String name, String CPF){
        this.name = name;
        this.CPF = CPF;
    }
    
    SecurityGuard(String name){
        this.name = name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setCPF(String CPF){
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
            System.out.println("Sucesso, CPF set");
        }
        else {
            System.out.printf("Erro, CPF invalido !!!\n Tente novamente\n CPF:\n");
            Scanner input = new Scanner(System.in);
            String cpf = input.nextLine();
            setCPF(cpf);
        }
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCPF(){
        return this.CPF;
    }

    @Override
    public void add(Person name,ArrayList<Person> list){
        System.out.println("Sorry, but you can't do that!!!");
    }

    @Override
    public void remove(String person, ArrayList<Person> listA){
        System.out.println("Sorry, but you can't do that!!!");
    }

    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print = print + " // CPF: " + this.CPF;
        }
        print += " // Type: SecurityGuard" + "\n";
        return print;
    }

}