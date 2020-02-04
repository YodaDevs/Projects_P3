package app.views.clientscreen;

import java.util.ArrayList;

import app.ExceptionHandling;
import app.*;
import app.person.*;
import app.data.*;
import app.person.clientperson.*;

public class ClientScreen {

    public DataSingleton dataList = DataSingleton.getInstance();
    public UserSingleton userInstance = UserSingleton.getInstance();

    public Client getClient() {
        return (Client) userInstance.getUser();
    }

    public DataSingleton getDataList() {
        return this.dataList;
    }

    public ArrayList<Person> getPersonList() {
        return this.dataList.getPersonList();
    } 

    public ArrayList<Drinks> getDrinksList() {
        return this.dataList.getDrinksList();
    } 

    public void startAdminScreen() {

        while(true) {
            
            System.out.println("What do you want to do?");
            System.out.println("(1) - Pay Drink"); 
            System.out.println("(2) - Rank of Drinks"); 
            System.out.println("(3) - Deposit Cash");
            System.out.println("(4) - Show my info");
            System.out.println("(5) - Drinks info"); 
            System.out.println("(0) - Sign out");	

            int op = ExceptionHandling.readInt();

            if(op == 0) break;

            switch(op){
                case 1:
                    System.out.println("What drink you want to pay?");
                    String drinkPay = ExceptionHandling.readString();
                    getClient().payBar(getDrinksList(), drinkPay);
                    break;
                
                case 2:
                    getClient().getRankingDrink(getDrinksList());
                    break;
                case 3:
                    System.out.println("How much?");
                    Float cash = ExceptionHandling.readfloat();
                    getClient().depositCash(cash);
                    break;
                case 4:
                    System.out.println(getClient().toString());
                    break;

                case 5:
                    getClient().printArrayDrinks(getDrinksList());
                    break;

                case 0:
                    break;
                
                default:
                    System.out.println("\n Incorrect input\n");
                    break;

            }
           
        }
    }
 
}