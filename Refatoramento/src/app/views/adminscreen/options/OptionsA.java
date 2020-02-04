package app.views.adminscreen.options;

import app.Drinks;
import app.ExceptionHandling;
import app.persontypes.*;
import app.views.adminscreen.AdminScreen;

public class OptionsA extends AdminScreen {

    int op;
     
    public OptionsA(int aux) {
        this.op = aux;
    }

    public void startOption() {

            switch(op){
                case 1:
                    System.out.println("What type of People?\nOptions: admin,client,barman,security\nWrite one:"); 
				
                    String type = ExceptionHandling.readString();
                    
                    if(type.equalsIgnoreCase("admin")){

                        Admin nameA = new Admin(null);
                        getAdmin().add(nameA, dataList.getPersonList());

                    }
                    else if(type.equalsIgnoreCase("client")){

                        Client nameB = new Client(null);
                        getAdmin().add(nameB, dataList.getPersonList());

                    }
                    else if(type.equalsIgnoreCase("barman")){

                        Barman nameC = new Barman(null);
                        getAdmin().add(nameC, dataList.getPersonList());

                    }
                    else if(type.equalsIgnoreCase("security")){

                        SecurityGuard nameD = new SecurityGuard(null);
                        getAdmin().add(nameD, dataList.getPersonList());

                    }
                    break;
                    
                case 2:
                    Drinks newDrink = new Drinks();
                    getAdmin().add(newDrink, dataList.getDrinksList());
                    break;
                
                case 0:
                    break;
                default:
                    System.out.println("\n Incorrect input\n");
                    break;
            }
    }
 
}