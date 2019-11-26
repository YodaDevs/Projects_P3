package app;

import java.util.ArrayList;
import java.util.Scanner;

class Client extends Login implements Person {
    
    private String name;
    private String CPF;
    private String password;
    private float cashClient;

    public ArrayList<String> drinkLike = new ArrayList<String>();

    Client(String name){
        this.setName(name);
        this.cashClient = 0;
    }

    @Override
    public void setCPF(String CPF){
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
            System.out.println("Sucesso, CPF set for Client");
            return;
        }
        else {
            System.out.printf("Erro, CPF invalido !!!\n Tente novamente\n CPF:\n");
            Scanner input = new Scanner(System.in);
            String cpf = input.nextLine();
            setCPF(cpf);
        }
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setCashClient(float cashClient) {
        this.cashClient = cashClient;
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
    public String getPassword() {
        return password;
    }

    public float getCashClient() {
        return this.cashClient;
    }

    @Override
    public void remove(String person, ArrayList<Person> listA){ // Need to have a way to blocked a client for some services
        System.out.println("Sorry, but you can't do that!!!");
    }

    public void payBar(ArrayList<Drinks> drinks, String myDrink){
        for (Drinks drinksA : drinks) {            
            if(drinksA.getName().equals(myDrink)) {                
                setCashClient(getCashClient() - drinksA.getPriceDrink());
                System.out.println("\nYour new cash is: " + getCashClient() + "\n Because "+ myDrink + "cost: " + drinksA.getPriceDrink());
                
                drinksA.setRank(drinksA.getRank() + 1);
                return;
            }       
        }
        System.out.println("Sorry, but we not find this drink in our bar, talk to admin please");  
    }

    public void depositCash(float cash){
        cash += getCashClient();
        setCashClient(cash);
    }

    @Override
    public void add(Person name,ArrayList<Person> list) {
        System.out.println("Sorry, but you can't do that!!!");

    }

    public void getRankingDrink(ArrayList<Drinks> drinks){
        for (Drinks drinksA : drinks) {            
            System.out.println("\nName of Product: " + drinksA.getName() + "\n" + 
            "Rank: " + drinksA.getPositionRank() + "\n" + "Type of Drink: " + 
            drinksA.getTypeDrink());
        } 
    }
    
    @Override
    public String toString(){
        String print = "Name: " + this.name + " // CPF: " + this.CPF;
        print += " // Type: Client" + "\n";
        if(!drinkLike.isEmpty()){
            print+= "Drinks that " + name + " like:\n";
            for(String num : drinkLike){
                print += num + " ";
            }
            print+= "\n";
        }
        else print += "about this client: " + name + " we don't have infomation about favorite drinks\n";
        return print;
    }



}