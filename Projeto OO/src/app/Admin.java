package app;

import java.util.ArrayList;
import java.util.Scanner;

class Admin extends Login implements Person {
    private String name;
    private String CPF;
    private String password;

    public Admin(String newName) {
        this.name = newName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if (checkCPF) {
            this.CPF = CPF;
        } else{
            System.out.printf("Erro, CPF invalido !!!\n Tente novamente\n CPF:\n");
            Scanner input = new Scanner(System.in);
            String cpf = input.nextLine();
            setCPF(cpf);
        }
    }

    @Override
    public void add(Person objPerson, ArrayList<Person> listA) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("What's the name?");
        String in = input.nextLine();
        objPerson.setName(in);

        System.out.println("Enter CPF: (only numbers)");
        String CPF = input.nextLine();
        objPerson.setCPF(CPF); 
        System.out.println("Sucess, CPF set");  

        System.out.println("What's your password?");
        in = input.nextLine();
        objPerson.setPassword(in);


        if (objPerson instanceof Client) {
            ((Client)objPerson).setCashClient(100);
            System.out.println("Do you have favorite drinks? Y or N");
            in = input.nextLine();
            if (in.equalsIgnoreCase("Y")) {

                System.out.println("We have this options:");
                
                if(drinks.isEmpty()) System.out.println("Sorry, we don't have drinks yet");
                else {
                    for (Drinks num : drinks) {
                        System.out.println(num.toString()); // Show drinks
                    }
                }

                System.out.println("Write yours favorites drinks, example: Vodka,Gin,Wine");
                in = input.nextLine();
                String[] names = in.split(",");
                for(String num : names){
                    ((Client)objPerson).drinkLike.add(num);
                }
            }
        }
        listA.add(objPerson);
        return;

    }
    
    public void add(Drinks objDrinks, ArrayList<Drinks> listA) {
        Scanner input = new Scanner(System.in);
        String in;

        if (objDrinks.getName() == null) {
            System.out.println("What the name of product?");
            in = input.nextLine();
            objDrinks.setName(in);
        }
        // Check if is this it
        if (objDrinks.getPriceDrink() <= 0) {
            System.out.println("What the price of product?");
            float price = ExceptionHandling.readfloat();
            objDrinks.setPriceDrink(price);
        }

        if (objDrinks.getBrand() == null) {
            System.out.println("What the brand of product?");
            in = input.nextLine();
            objDrinks.setBrand(in);
        }

        if (objDrinks.getExpirationDate() == null) {
            System.out.println("What the Expiration Date of product? Date Format: DD/MM/YYYY");
            in = ExceptionHandling.readDate();
            objDrinks.setExpirationDate(in);
        }
        
        if(objDrinks.getTypeDrink() == null){
            System.out.println("What the Type of Drink of product?\nlist of type:\nVodka, Beer, Whisky, Wine, Gin");
            in = input.nextLine();
            objDrinks.setTypeDrink(in);
        }
        
        listA.add(objDrinks);
    }

    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print += " // CPF: " + this.CPF;
        }
        print += " Type: Admin";
        return print;
    }

    @Override
    public void remove(String person, ArrayList<Person> listA) {
        for (Person personA : listA) {            
            if(personA.getName().equals(person)) {                
                listA.remove(personA);
                System.out.println("\nRemoved from the list: " + person);
                break;
            }       
        }   
    }

    public void removeDrink(String drink, ArrayList<Drinks> listA) {
        for (Drinks drinksA : listA) {            
            if(drinksA.getName().equals(drink)) {                
                listA.remove(drinksA);
                System.out.println("\nRemoved from the list: " + drink);
                break;
            }       
        }   
    }

    public void editPerson(ArrayList<Person> listA){ 
        Scanner input = new Scanner(System.in);
        String newName;
        int newOp = 10;
        System.out.println("What the name of Person?");
            String name = input.nextLine();
            for (Person personA : listA) {
                if(personA.getName().equals(name) && personA instanceof Person) {

                    System.out.println("Want to edit? \n name(1) \n CPF(2) \n Password(3) \n Exit(0)");
                    newOp = input.nextInt();
                    input.nextLine();
                    if(newOp == 1) {
                        System.out.println("What the new name?");
                        newName = input.nextLine();
                        personA.setName(newName);
                    }
                    else if(newOp == 2) {
                        System.out.println("What the new CPF?");
                        newName = input.nextLine();
                        personA.setCPF(newName);
                        System.out.println("Sucess, CPF set");
                    }
                    else if(newOp == 3) {
                        System.out.println("What the new Password?");
                        newName = input.nextLine();
                        personA.setPassword(newName);
                    }
                    break;
                }       
            }
    }

    public void editDrink(ArrayList<Drinks> listA) { 
        Scanner input = new Scanner(System.in);
        String newName;
        int newOp = 10;

        System.out.println("What the name of Drink?");
            String name = input.nextLine();
            for (Drinks drinksA : listA) {
                if(drinksA.getName().equals(name) && drinksA instanceof Drinks) {
                    while(true){
                        System.out.println("Want to edit? \n Name(1) \n Brand(2) \n Expiration Date(3) \n Type of Drink(4) \n Price of Drink(5) \n Exit(0)");
                        newOp = ExceptionHandling.readInt();
                        input.nextLine();
                        if(newOp == 1){
                            System.out.println("What the new Name?");
                            newName = input.nextLine();
                            drinksA.setName(newName);
                        }
                        else if(newOp == 2){
                            System.out.println("What the new Brand?");
                            newName = input.nextLine();
                            drinksA.setBrand(newName);
                        }
                        else if(newOp == 3){
                            System.out.println("What the new Expiration Date? Date Format: DD/MM/YYYY");
                            newName = ExceptionHandling.readDate();
                            drinksA.setExpirationDate(newName);
                        }
                        else if(newOp == 4){
                            System.out.println("What the new Type of Drink?\nlist of type:\nVodka, Beer, Whisky, Wine, Gin");
                            newName = input.nextLine();
                            drinksA.setTypeDrink(newName);
                        }
                        else if(newOp == 5){
                            System.out.println("What the new Price of Drink?");
                            Float newPrice =  ExceptionHandling.readfloat();
                            drinksA.setPriceDrink(newPrice);
                        }
                        else if(newOp == 0){
                            break;
                        }
                    }
                    if(newOp == 0) break;
                }       
            }
    }

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