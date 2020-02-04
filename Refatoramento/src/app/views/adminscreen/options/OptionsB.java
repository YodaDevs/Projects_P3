package app.views.adminscreen.options;

import app.views.adminscreen.AdminScreen;

public class OptionsB extends AdminScreen {

    int op;
     
    public OptionsB(int aux) {
        this.op = aux;
    }

    public void startOption() {

            switch(op){
                case 3:
                adminPerson.editPerson(dataList.getPersonList());
                break;

                case 4:
                adminDrinks.editDrink(dataList.getDrinksList());
                break;

                case 0:
                    break;
                default:
                    System.out.println("\n Incorrect input\n");
                    break;
            }
    }
 
}