package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Login user = new Login();
        Scanner input = new Scanner(System.in);
        int sign;
        while(true) {

            System.out.println("(1) - Sign in");
            System.out.println("(0) - Exit");
            sign = input.nextInt();
            input.nextLine();
            if(sign == 0) break;

            if(sign == 1){
                Person uPerson = user.signIn();
                int op;

                while(true){

                    if( uPerson instanceof Admin) {

                        System.out.println("What do you want to do?");
                        System.out.println("(1) - Add People"); 
                        System.out.println("(2) - Add Drinks");  
                        System.out.println("(3) - Edit People");	
                        System.out.println("(4) - Edit Drinks");
                        System.out.println("(5) - Remove People");
                        System.out.println("(6) - Remove Drinks");
                        System.out.println("(7) - Show Report"); 
                        System.out.println("(0) - Sign out");	

                        op = input.nextInt();
                        input.nextLine();

                        Admin admin = (Admin) uPerson;

                        if(op == 0) break;

                        switch(op){
                            case 1:
                                System.out.println("What type of People?\n Options: admin,client,barman,security\n Write one:"); 
                                String type = input.nextLine();
                                if(type.equalsIgnoreCase("admin")){
                                    Admin nameA = new Admin(null);
                                    admin.add(nameA, user.getList());
                                }
                                else if(type.equalsIgnoreCase("client")){
                                    Client nameB = new Client(null);
                                    admin.add(nameB, user.getList());
                                }
                                else if(type.equalsIgnoreCase("barman")){
                                    Barman nameC = new Barman(null);
                                    admin.add(nameC, user.getList());
                                }
                                else if(type.equalsIgnoreCase("security")){
                                    SecurityGuard nameD = new SecurityGuard(null);
                                    admin.add(nameD, user.getList());
                                }
                                break;

                            case 2:
                                Drinks newDrink = new Drinks();
                                admin.add(newDrink, user.drinks);
                                break;
                            
                            case 3:
                                admin.editPerson(user.getList());
                                break;

                            case 4:
                                admin.editDrink(user.drinks);
                                break;

                            case 5:
                                System.out.println("What the name of person?");
                                String person = input.nextLine();
                                admin.remove(person, user.getList());
                                break;

                            case 6:
                                System.out.println("What the name of drink?");
                                String drink = input.nextLine();
                                admin.removeDrink(drink, user.drinks);
                                break;

                            case 7:
                                admin.reportData(user.drinks, user.getList());
                                break;

                            case 0:
                                break;
                            default:
                                System.out.println("\n Incorrect input\n");
                                break;
                        }

                    } else if (uPerson instanceof Barman) {

                        Barman barman = (Barman) uPerson;

                        System.out.println("What do you want to do?");
                        System.out.println("(1) - Show my info");  
                        System.out.println("(0) - Sign out");	

                        op = input.nextInt();
                        input.nextLine();

                        if(op == 0) break;

                        switch(op){
                            case 1:
                                barman.toString();
                                break;

                            case 0:
                                break;
                            
                            default:
                                System.out.println("\n Incorrect input\n");
                                break;

                        }

                    } else if (uPerson instanceof Client) {

                        Client client = (Client) uPerson;

                        System.out.println("What do you want to do?");
                        System.out.println("(1) - Pay Drink"); 
                        System.out.println("(2) - Rank of Drinks"); 
                        System.out.println("(3) - Deposit Cash"); 
                        System.out.println("(0) - Sign out");	

                        op = input.nextInt();
                        input.nextLine();

                        if(op == 0) break;

                        switch(op){
                            case 1:
                                System.out.println("What drink you want to pay?");
                                String drinkPay = input.nextLine();
                                client.payBar(user.drinks, drinkPay);
                                break;
                            
                            case 2:
                                client.getRankingDrink(user.drinks);
                                break;
                            case 3:
                                System.out.println("How much?");
                                Float cash = ExceptionHandling.readfloat();
                                client.depositCash(cash);

                            case 0:
                                break;
                            
                            default:
                                System.out.println("\n Incorrect input\n");
                                break;

                        }

                    } else if (uPerson instanceof SecurityGuard) {

                        SecurityGuard securityGuard = (SecurityGuard) uPerson;  

                        System.out.println("What do you want to do?");
                        System.out.println("(1) - Show my info"); 
                        System.out.println("(0) - Sign out");	

                        op = input.nextInt();
                        input.nextLine();

                        if(op == 0) break;

                        switch(op){
                            case 1:
                                securityGuard.toString();
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
        }
        input.close();
    }
}