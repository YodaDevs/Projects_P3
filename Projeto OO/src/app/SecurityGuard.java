package app;

import java.util.ArrayList;

class SecurityGuard extends Login implements Person{
    
    private String name;
    private String CPF;

    
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

    public String getName() {
        return this.name;
    }

    @Override
    public void setCPF(String CPF){
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
            System.out.println("Sucesso, CPF set");
        }
        else System.out.printf("Erro, CPF invalido !!!\n");
    }

    public String getCPF(){
        return this.CPF;
    }

    public void add(Person name,ArrayList<Person> list){
        System.out.println("Sorry, but you can't do that!!!");
    }

    public void remove(String person, ArrayList<Person> listA){
        System.out.println("Sorry, but you can't do that!!!");
    }

    public void edit(){

    }

    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print = print + " // CPF: " + this.CPF;
        }
        print += " // Type: SecurityGuard" + "\n";
        return print;
    }

}