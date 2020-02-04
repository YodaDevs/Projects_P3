package app.person.adminperson;

import java.util.ArrayList;

import app.*;
import app.person.*;
import app.person.clientperson.*;

public class AdminPerson extends AdminAbstract {

    public void add(Person objPerson, ArrayList<Person> listA) {
        
        System.out.println("What's the name?");
        objPerson.setName(ExceptionHandling.readString());

        System.out.println("Enter CPF: (only numbers)");
        objPerson.setCPF(ExceptionHandling.readString()); 
        System.out.println("Sucess, CPF set");  

        System.out.println("What's your password?");
        objPerson.setPassword(ExceptionHandling.readString());


        if (objPerson instanceof Client) {
           
            ((Client)objPerson).setCashClient(100);
            System.out.println("Do you have favorite drinks? Y or N");
            String in = ExceptionHandling.readString();

            if (in.equalsIgnoreCase("Y")) {
                
                System.out.println("Write yours favorites drinks, options type: Vodka,Gin,Wine,Beer,Whisky");
                System.out.println("Please use this format, example: Heineken,Pietra,Stella Artois");
                in = ExceptionHandling.readString();

                String[] names = in.split(",");

                for(String num : names){
                    ((Client)objPerson).drinkLike.add(num);
                }

            }
        }
        
        listA.add(objPerson);
        return;

    }

    public void remove(String person, ArrayList<Person> listA) {
        for (Person personA : listA) {            
            if(personA.getName().equals(person)) {                
                listA.remove(personA);
                System.out.println("\nRemoved from the list: " + person);
                return;
            }       
        }
        System.out.println("Sorry, incorrect name, please try again");   
    }

    public void editPerson(ArrayList<Person> listA){ 
        String newName;
        int newOp = 10;
        System.out.println("What the name of Person?");
            String name = ExceptionHandling.readString();
            for (Person personA : listA) {
                if(personA.getName().equals(name) && personA instanceof Person) {
                    while(true) {
                        System.out.println("Want to edit? \n(1) - name\n(2) - CPF\n(3) - Password\n(4) - Add favorite Drink(only for clients)\n(0) - Exit");
                        newOp = ExceptionHandling.readInt();

                        if(newOp == 1) {
                            System.out.println("What the new name?");
                            newName = ExceptionHandling.readString();
                            personA.setName(newName);
                            System.out.println("Sucess, edited\n");
                        }
                        else if(newOp == 2) {
                            System.out.println("What the new CPF?");
                            newName = ExceptionHandling.readString();
                            personA.setCPF(newName);
                            System.out.println("Sucess, edited\n");
                        }
                        else if(newOp == 3) {
                            System.out.println("What the new Password?");
                            newName = ExceptionHandling.readString();
                            personA.setPassword(newName);
                            System.out.println("Sucess, edited\n");
                        }
                        else if(newOp == 4 && personA instanceof Client) {
                            System.out.println("Add yours favorites drinks, options type: Vodka,Gin,Wine,Beer,Whisky");
                            System.out.println("Please use this format, example: Heineken,Pietra,Stella Artois");
                            String in = ExceptionHandling.readString();
                            String[] names = in.split(",");
                            for(String num : names){
                                ((Client)personA).drinkLike.add(num);
                            }
                        }
                        else {
                            System.out.println("Sorry, you can't do that\n");
                        }
                        if(newOp == 0) break;
                        
                    }
                    if(newOp == 0) break;
                }       
            }
    }
}