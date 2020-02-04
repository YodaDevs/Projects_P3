package app.views.adminscreen;

import java.util.ArrayList;

import app.ExceptionHandling;
import app.*;
import app.person.*;
import app.data.*;
import app.person.adminperson.*;
import app.views.adminscreen.options.*;

public class AdminScreen {

    public DataSingleton dataList = DataSingleton.getInstance();
    public UserSingleton userInstance = UserSingleton.getInstance();
    public AdminPerson adminPerson = new AdminPerson();
    public AdminDrinks adminDrinks = new AdminDrinks();

    public AdminAbstract getAdmin() {
        return (AdminAbstract) userInstance.getUser();
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
            System.out.println("(1) - Add People"); 
            System.out.println("(2) - Add Drinks");  
            System.out.println("(3) - Edit People");	
            System.out.println("(4) - Edit Drinks");
            System.out.println("(5) - Remove People");
            System.out.println("(6) - Remove Drinks");
            System.out.println("(7) - Show Report"); 
            System.out.println("(0) - Sign out");	

            int op = ExceptionHandling.readInt();

            if(op == 0) break;

            else if (op == 1 || op == 2) {
                OptionsA option = new OptionsA(op);
                option.startOption();
            }
            else if ( op == 3 || op == 4){
                OptionsB option = new OptionsB(op);
                option.startOption();
            }
            else if( op > 4 && op < 8){
                OptionsC option = new OptionsC(op);
                option.startOption();
            }
           
        }
    }
 
}