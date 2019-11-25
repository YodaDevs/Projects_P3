package app;

import java.util.ArrayList;

class Client extends Login implements Person {
    
    private String name;
    private String CPF;
    private float cashClient;

    public ArrayList<String> drinkLike = new ArrayList<String>();

    Client(String name){
        this.setName(name);
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

    @Override
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getCPF(){
        return this.CPF;
    }

    public void setCashClient(float cashClient) {
        this.cashClient = cashClient;
    }

    public float getCashClient() {
        return this.cashClient;
    }

    public void add(String name){ 
        System.out.println("Sorry, but you can't do that!!!");
    }

    @Override
    public void remove(String person, ArrayList<Person> listA){ // Need to have a way to blocked a client for some services
        System.out.println("Sorry, but you can't do that!!!");
    }

    
    public void edit(){ // Need to have a way to blocked a client for some services
        
    }

    public void payBar(ArrayList<Drinks> drinks, String myDrink){
        for (Drinks drinksA : drinks) {            
            if(drinksA.getName().equals(myDrink)) {                
                setCashClient(getCashClient() - drinksA.getPriceDrink());
                System.out.println("\nYour new cash is: " + getCashClient() + "\n Because "+ myDrink + "cost: " + drinksA.getPriceDrink());
                
                drinksA.setRank(drinksA.getRank() + 1);
                break;
            }       
        }  
    }

    public void depositCash(float cash){
        cash += getCashClient();
        setCashClient(cash);
    }

    @Override
    public void add(Person name,ArrayList<Person> list) {
        // TODO Auto-generated method stub

    }

    public void getRankingDrink(ArrayList<Drinks> drinks){
        for (Drinks drinksA : drinks) {            
            System.out.println("\nName of Product: " + drinksA.getName() + "\n" + 
            "Rank: " + drinksA.getPositionRank() + "\n" + "Type of Drink: " + 
            drinksA.getTypeDrink());
        } 
    }

    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print = print + " // CPF: " + this.CPF;
        }
        print += " // Type: Client" + "\n";
        return print;
    }



}