package app.views.adminscreen.options;

import app.*;
import app.views.adminscreen.AdminScreen;

public class OptionsC extends AdminScreen {

    int op;
     
    public OptionsC(int aux) {
        this.op = aux;
    }
    
    public void startOption() {

            if(op == 5){
                    System.out.println("What the name of person?");
                    String person = ExceptionHandling.readString();
                    getAdmin().remove(person, getPersonList());
            }
            else if ( op == 6){
                    System.out.println("What the name of drink?");
                    Drinks drinkA = new Drinks();
                    drinkA.setName(ExceptionHandling.readString());
                    getAdmin().remove(drinkA, getDrinksList());
            }
            else if ( op == 7){
                   getAdmin().reportData(getDrinksList(),getPersonList());
            }
        }
}