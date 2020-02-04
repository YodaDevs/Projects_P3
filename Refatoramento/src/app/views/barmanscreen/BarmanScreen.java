package app.views.barmanscreen;

import java.util.ArrayList;

import app.ExceptionHandling;
import app.*;
import app.data.*;
import app.persontypes.*;

public class BarmanScreen {

    public DataSingleton dataList = DataSingleton.getInstance();
    public UserSingleton userInstance = UserSingleton.getInstance();

    public Barman getBarman() {
        return (Barman) userInstance.getUser();
    }

    public DataSingleton getDataList() {
        return this.dataList;
    }

    public ArrayList<Drinks> getDrinksList() {
        return this.dataList.getDrinksList();
    } 

    public void startAdminScreen() {

        while(true) {
            
            System.out.println("What do you want to do?");
            System.out.println("(1) - Show my info");  
            System.out.println("(2) - Drinks info"); 
            System.out.println("(0) - Sign out");	

            int op = ExceptionHandling.readInt();

            if(op == 0) break;

            switch(op){
                case 1:
                    System.out.println(getBarman().toString()); 
                    break;
                case 2:
                    getBarman().printArrayDrinks(getDrinksList());
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