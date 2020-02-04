package app.views.securityguardscreen;

import java.util.ArrayList;

import app.ExceptionHandling;
import app.*;
import app.data.*;
import app.persontypes.*;

public class SecurityGuardScreen {

    public DataSingleton dataList = DataSingleton.getInstance();
    public UserSingleton userInstance = UserSingleton.getInstance();

    public SecurityGuard getGuard() {
        return (SecurityGuard) userInstance.getUser();
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
                    System.out.println(getGuard().toString()); 
                    break;
                case 2:
                    getGuard().printArrayDrinks(getDrinksList());
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