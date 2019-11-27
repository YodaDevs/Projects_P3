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

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @return the password
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cpf
     */
    @Override
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the cpf to set
     */
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
    /** 
     * @param objPerson   Object of type Person that we set name,cpf,password and if an client, we set favorite drinks
     * @param listA       This list is our ArrayList of persons, that can be Client,Admin,Barman and Security Guard
     * @return            Void, because we just need to add all the information at list, if we need some information, we check at the list
     */
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
                System.out.println("Write yours favorites drinks, options type: Vodka,Gin,Wine,Beer,Whisky");
                System.out.println("Please use this format, example: Heineken,Pietra,Stella Artois");
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

    /** 
     * @param objDrink    Object of type Drink that we set name,price,brand, expiration date and type of drink, example: vodka;
     * @param listA       This list is our ArrayList of drinks
     * @return            Void, because we just need to add all the information at list, if we need some information, we check at the list
     */
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
            System.out.print("R$ ");
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

    /** 
     * @return  The string with information about Admin
     */
    @Override
    public String toString(){
        String print = "Name: " + this.name;

        if(this.CPF != null){
            print += " // CPF: " + this.CPF;
        }
        print += " Type: Admin";
        return print;
    }

    /** 
     * @param Person      Person of type String is the name of person that you want to remove
     * @param listA       this is the list that you want to use to remove Person
     * @return            Void, because we just need to remove from the list
     */
    @Override
    public void remove(String person, ArrayList<Person> listA) {
        for (Person personA : listA) {            
            if(personA.getName().equals(person)) {                
                listA.remove(personA);
                System.out.println("\nRemoved from the list: " + person);
                break;
            }       
        }
        System.out.println("Sorry, incorrect name, please try again");   
    }

    /** 
     * @param Drink       Drink of type String is the name of drink that you want to remove
     * @param listA       this is the list that you want to use to remove drink
     * @return            Void, because we just need to remove from the list
     */
    public void removeDrink(String drink, ArrayList<Drinks> listA) {
        for (Drinks drinksA : listA) {            
            if(drinksA.getName().equals(drink)) {                
                listA.remove(drinksA);
                System.out.println("\nRemoved from the list: " + drink + "\n");
                break;
            }       
        }   
        System.out.println("Sorry, incorrect name, please try again\n");   
    }

    /** 
     * @param listA       this is the list that you want to use to edit Person
     * @return            Void, because we just need to edit from the list
     */
    public void editPerson(ArrayList<Person> listA){ 
        Scanner input = new Scanner(System.in);
        String newName;
        int newOp = 10;
        System.out.println("What the name of Person?");
            String name = input.nextLine();
            for (Person personA : listA) {
                if(personA.getName().equals(name) && personA instanceof Person) {
                    while(true) {
                        System.out.println("Want to edit? \n(1) - name\n(2) - CPF\n(3) - Password\n(4) - Add favorite Drink(only for clients)\n(0) - Exit");
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
                        }
                        else if(newOp == 3) {
                            System.out.println("What the new Password?");
                            newName = input.nextLine();
                            personA.setPassword(newName);
                        }
                        else if(newOp == 4 && personA instanceof Client){
                            System.out.println("Add yours favorites drinks, options type: Vodka,Gin,Wine,Beer,Whisky");
                            System.out.println("Please use this format, example: Heineken,Pietra,Stella Artois");
                            String in = input.nextLine();
                            String[] names = in.split(",");
                            for(String num : names){
                                ((Client)personA).drinkLike.add(num);
                            }
                        }
                        if(newOp == 0) break;
                        System.out.println("Sucess, edited\n");
                    }
                    if(newOp == 0) break;
                }       
            }
    }

    /** 
     * @param listA       this is the list that you want to use to edit Drink
     * @return            Void, because we just need to edit from the list
     */
    public void editDrink(ArrayList<Drinks> listA) { 
        Scanner input = new Scanner(System.in);
        String newName;
        int newOp = 10;

        System.out.println("What the name of Drink?");
            String name = input.nextLine();
            for (Drinks drinksA : listA) {
                if(drinksA.getName().equals(name) && drinksA instanceof Drinks) {
                    while(true){
                        System.out.println("Want to edit? \n(1) - Name\n(2) - Brand\n(3) - Expiration Date\n(4) - Type of Drink\n(5) - Price of Drink\n(0) - Exit");
                        newOp = ExceptionHandling.readInt();

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
                            System.out.print("R$ ");
                            Float newPrice =  ExceptionHandling.readfloat();
                            drinksA.setPriceDrink(newPrice);
                        }
                        else if(newOp == 0) break;
                        System.out.println("Sucess, edited\n");
                    }
                    if(newOp == 0) break;
                }       
            }
    }

    /** 
     * @param drinks      this is the list that you want to show all drinks information
     * @param people      this is the list that you want to show people information
     * @return            Void, because we just need the list to show all information about drinks and people
     */
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