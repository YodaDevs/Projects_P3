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

    /**
     * @param CPF the cpf to set
     */
    @Override
    public void setCPF(String CPF){
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if(checkCPF) {
            this.CPF = CPF;
            return;
        }
        else {
            System.out.printf("Erro, CPF invalido !!!\n Tente novamente\n CPF:\n");
            Scanner input = new Scanner(System.in);
            String cpf = input.nextLine();
            setCPF(cpf);
        }
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name){
        this.name = name;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @param cashClient the cash client to set
     */
    public void setCashClient(float cashClient) {
        this.cashClient = cashClient;
    }
    
     /**
     * @return the name
     */
    @Override
    public String getName() {
        return this.name;
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
     * @return the Cash Client
     */
    public float getCashClient() {
        return this.cashClient;
    }

    /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because client doesn't have permission to remove people in this software
     */
    @Override
    public void remove(String person, ArrayList<Person> listA){ // Need to have a way to blocked a client for some services
        System.out.println("Sorry, but you can't do that!!!");
    }

    /** 
     * @param drinks      List of drinks
     * @param myDrinks    Drink that you want to pay
     * @return            Void, because we just need to count tha payment
     */
    public void payBar(ArrayList<Drinks> drinks, String myDrink){
        for (Drinks drinksA : drinks) {            
            if(drinksA.getName().equals(myDrink)) {   
                float cash = getCashClient() - drinksA.getPriceDrink();
                if(cash < 0) {
                    System.out.println("Sorry, but you can't pay this drink, please deposit more to buy this drink");
                    return;
                }              
                setCashClient(cash);
                System.out.println("\nYour new cash is: R$" + getCashClient() + "\nBecause "+ myDrink + "cost: R$" + drinksA.getPriceDrink() + "\n");
                
                drinksA.setRank(drinksA.getRank() + 1);
                return;
            }       
        }
        System.out.println("Sorry, but we not find this drink in our bar, talk to admin please");  
    }

    /** 
     * @param cash      Value that we deposit for client
     * @return          Void, because we just need to deposit cash for client
     */
    public void depositCash(float cash){
        cash += getCashClient();
        setCashClient(cash);
        System.out.println("Deposit sucess"+ " now your cash is: R$" + cashClient + "\n");
    }

    /** 
     * @param name      Name of person
     * @param list      List of people
     * @return          Void, because client doesn't have permission to add people in this software
     */
    @Override
    public void add(Person name,ArrayList<Person> list) {
        System.out.println("Sorry, but you can't do that!!!");

    }

    /** 
     * @param drinks      List of drinks
     * @return            Void, because we just need to show information of rank about the drinks
     */
    public void getRankingDrink(ArrayList<Drinks> drinks){
        for (Drinks drinksA : drinks) {            
            System.out.println("\nName of Product: " + drinksA.getName() + "\n" + 
            "Rank: " + drinksA.getPositionRank() + "\n" + "Type of Drink: " + 
            drinksA.getTypeDrink());
        }
        System.out.println(); 
    }

    /** 
     * @return    The string with information about Client
     */
    @Override
    public String toString(){
        String print = "\nName: " + this.name + " // CPF: " + this.CPF;
        print += " // Type: Client" + "\n";
        if(!drinkLike.isEmpty()){
            print+= "Drinks that " + name + " like:\n// ";
            for(String num : drinkLike){
                print += num + " // ";
            }
            print+= "\n";
        }
        else print += "about this client: " + name + " we don't have infomation about favorite drinks\n";
        return print;
    }



}