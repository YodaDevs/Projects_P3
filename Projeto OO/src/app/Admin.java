package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Admin extends Login implements Person {
    private String name;
    private String CPF;

    public Admin(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        boolean checkCPF = ValidaCPF.isCPF(CPF);
        if (checkCPF) {
            this.CPF = CPF;
            System.out.println("Sucesso, CPF set");
        } else
            System.out.printf("Erro, CPF invalido !!!\n");
    }

    @Override
    public void add(Person objPerson, ArrayList<Person> listA) {

        // Use method setCPF to improve this point
        System.out.println("CPF?\n Y or N");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();

        if (in.equalsIgnoreCase("Y")) {
            System.out.println("Enter CPF: (only numbers)");
            String CPF = input.nextLine();
            objPerson.setCPF(CPF);
        }

        if (objPerson instanceof Client) {
            System.out.println("Do you have favorite drinks? Y or N");
            in = input.nextLine();
            if (in.equalsIgnoreCase("Y")) {

                System.out.println("Have this options:");
                for (Drinks num : drinks) {
                    System.out.println(num.toString()); // Show names of drinks
                }

            }
        }
        listA.add(objPerson);

    }

    public void add(Drinks objDrinks, ArrayList<Drinks> listA) throws ParseException {
        Scanner input = new Scanner(System.in);
        String in;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (objDrinks.getName() == null) {
            System.out.println("What the name of product?");
            in = input.nextLine();
            objDrinks.setName(in);
        }

        if (objDrinks.getBrand() == null) {
            System.out.println("What the brand of product?");
            in = input.nextLine();
            objDrinks.setBrand(in);
        }

        if (objDrinks.getExpirationDate() == null) {
            System.out.println("What the Expiration Date of product? Date Format: DD/MM/YYYY");
            in = input.nextLine();
            Date data = dateFormat.parse(in);
            String str = dateFormat.format(data);
            objDrinks.setExpirationDate(str);
        }
        
        if(objDrinks.getTypeDrink() == null){
            System.out.println("What the Type of Drink of product? list");
            in = input.nextLine();
            objDrinks.setTypeDrink(in);
        }

        listA.add(objDrinks);
    }

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

                    System.out.println("Want to edit? \n name(1) \n CPF(2) \n Exit(0)");
                    newOp = input.nextInt();
                    input.nextLine();
                    if(newOp == 1){
                        System.out.println("What the new name?");
                        newName = input.nextLine();
                        personA.setName(newName);
                    }
                    else if(newOp == 2){
                        System.out.println("What the new CPF?");
                        newName = input.nextLine();
                        personA.setCPF(newName);
                    }
                    break;
                }       
            }
    }

    public void editDrink(ArrayList<Drinks> listA) throws ParseException { 
        Scanner input = new Scanner(System.in);
        String newName;
        int newOp = 10;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("What the name of Drink?");
            String name = input.nextLine();
            for (Drinks drinksA : listA) {
                if(drinksA.getName().equals(name) && drinksA instanceof Drinks) {
                    while(true){
                        System.out.println("Want to edit? \n Name(1) \n Brand(2) \n Expiration Date(3) \n Type of Drink(4) \n Exit(0)");
                        newOp = input.nextInt();
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
                            newName = input.nextLine();
                            Date data = dateFormat.parse(newName);
                            String str = dateFormat.format(data);
                            drinksA.setExpirationDate(str);
                        }
                        else if(newOp == 4){
                            System.out.println("What the new Type of Drink?");
                            newName = input.nextLine();
                            drinksA.setTypeDrink(newName);
                        }
                        else if(newOp == 0){
                            break;
                        }
                    }
                    if(newOp == 0) break;
                }       
            }
    }


    public void editDrinks(ArrayList<Drinks> listA){

    }

}