package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Login test = new Login();
        Person ad = test.signIn();

        if( ad instanceof Admin) {

            Admin admin = (Admin) ad;

            admin.setName("Marc");
            admin.setCPF("09068183460");
            
            /*Client nameC = new Client("John");
            Barman nameB = new Barman("Pedro");
            SecurityGuard nameG = new SecurityGuard("Severino");
            admin.add(nameC,test.list);
            nameC = new Client("Maria");
            admin.add(nameC,test.list);
            nameC = new Client("Karl");
            admin.add(nameC,test.list);
            admin.add(nameB, test.list);
            admin.add(nameG, test.list);*/
            Drinks nameD = new Drinks();
            printArray(test.list);

            admin.remove("Maria", test.list);
            System.out.println("");

            printArray(test.list);

            /*admin.editPerson(test.list);
            
            printArray(test.list);*/

            admin.add(nameD, test.drinks);

            printArrayDrinks(test.drinks);


        } else if (ad instanceof Employee) {

            Employee employee = (Employee) ad;

        } else if (ad instanceof Client) {

            Client client = (Client) ad;

        }

    }

    public static void printArray(ArrayList<Person> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
        }
    }

    public static void printArrayDrinks(ArrayList<Drinks> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
        }
    }
}