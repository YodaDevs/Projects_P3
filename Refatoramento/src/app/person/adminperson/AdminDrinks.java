package app.person.adminperson;

import java.util.ArrayList;

import app.*;

public class AdminDrinks extends AdminAbstract {
    /** 
     * @param objDrink    Object of type Drink that we set name,price,brand, expiration date and type of drink, example: vodka;
     * @param listA       This list is our ArrayList of drinks
     * @return            Void, because we just need to add all the information at list, if we need some information, we check at the list
     */
    public void add(Drinks objDrinks, ArrayList<Drinks> listA) {

        if (objDrinks.getName() == null) {
            System.out.println("What the name of product?");
            objDrinks.setName(ExceptionHandling.readString());
        }
        // Check if is this it
        if (objDrinks.getPriceDrink() <= 0) {
            System.out.println("What the price of product?");
            System.out.print("R$ ");
            objDrinks.setPriceDrink(ExceptionHandling.readfloat());
        }

        if (objDrinks.getBrand() == null) {
            System.out.println("What the brand of product?");
            objDrinks.setBrand(ExceptionHandling.readString());
        }

        if (objDrinks.getExpirationDate() == null) {
            System.out.println("What the Expiration Date of product? Date Format: DD/MM/YYYY");
            objDrinks.setExpirationDate(ExceptionHandling.readDate());
        }
        
        if(objDrinks.getTypeDrink() == null){
            System.out.println("What the Type of Drink of product?\nlist of type:\nVodka, Beer, Whisky, Wine, Gin");
            objDrinks.setTypeDrink(ExceptionHandling.readString());
        }
        
        listA.add(objDrinks);
    }

    /** 
     * @param Drink       Drink of type String is the name of drink that you want to remove
     * @param listA       this is the list that you want to use to remove drink
     * @return            Void, because we just need to remove from the list
     */
    public void remove(Drinks drinkA, ArrayList<Drinks> listA) {
        String drink = drinkA.getName();
        for (Drinks drinksA : listA) {            
            if(drinksA.getName().equals(drink)) {                
                listA.remove(drinksA);
                System.out.println("\nRemoved from the list: " + drink + "\n");
                return;
            }       
        }   
        System.out.println("Sorry, incorrect name, please try again\n");   
    }

    /** 
     * @param listA       this is the list that you want to use to edit Drink
     * @return            Void, because we just need to edit from the list
     */
    public void editDrink(ArrayList<Drinks> listA) { 
        String newName;
        int newOp = 10;

        System.out.println("What the name of Drink?");
            String name = ExceptionHandling.readString();
            for (Drinks drinksA : listA) {
                if(drinksA.getName().equals(name) && drinksA instanceof Drinks) {
                    while(true){
                        System.out.println("Want to edit? \n(1) - Name\n(2) - Brand\n(3) - Expiration Date\n(4) - Type of Drink\n(5) - Price of Drink\n(0) - Exit");
                        newOp = ExceptionHandling.readInt();

                        if(newOp == 1){
                            System.out.println("What the new Name?");
                            newName = ExceptionHandling.readString();
                            drinksA.setName(newName);
                        }
                        else if(newOp == 2){
                            System.out.println("What the new Brand?");
                            newName = ExceptionHandling.readString();
                            drinksA.setBrand(newName);
                        }
                        else if(newOp == 3){
                            System.out.println("What the new Expiration Date? Date Format: DD/MM/YYYY");
                            newName = ExceptionHandling.readDate();
                            drinksA.setExpirationDate(newName);
                        }
                        else if(newOp == 4){
                            System.out.println("What the new Type of Drink?\nlist of type:\nVodka, Beer, Whisky, Wine, Gin");
                            newName = ExceptionHandling.readString();
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
}