package app;

import java.util.ArrayList;

class Admin extends Login{
    String name;
    String CPF;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
            System.out.println("Sucesso, CPF set");
        }
        else System.out.printf("Erro, CPF invalido !!!\n");
    }

    public void add(Admin person, ArrayList<Admin> list){
        list.add(person);
    }

    public void remove(Admin person, ArrayList<Admin> list) {
        list.remove(person);
    }

    public void edit(Admin person, ArrayList<Admin> list){
        int indexPerson = list.indexOf(person);
        if( indexPerson != -1 ){
            // Input Stream for edit list
            list.get(indexPerson).setName(name);
            list.get(indexPerson).setName(CPF);
        }
    }


}