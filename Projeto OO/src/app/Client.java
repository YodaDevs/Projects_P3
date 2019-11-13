package app;

import java.util.ArrayList;

class Client extends Admin {
    ArrayList<String> drinkLike = new ArrayList<String>();

    public Client(String name){
        this.name = name;    
    }
    
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void payBar(){
        
    }

}