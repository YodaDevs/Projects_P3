package app;

import java.util.ArrayList;
import java.util.Scanner;

class Login {
    private String adminLogin = "adm123";
    private String passwordAdmin = "adm123";
    private String clientLogin = "cli123";
    private String securityGuardLogin = "sec123";
    private String barmanLogin = "bar123";
    public ArrayList<Person> list = new ArrayList<Person>(); // Need to know when login how many persons in this system
                                                      // Check if InstanceOf solution the problem about type of class in array
    public ArrayList<Drinks> drinks = new ArrayList<Drinks>();

    public String toString(){
        return "halla1";
    }

    public Person signIn(){
        Scanner input = new Scanner(System.in);
        System.out.println("Id:");
        String login = input.nextLine();
        System.out.println("Password:");
        String password = input.nextLine();
        if(login.equals(this.adminLogin) && password.equals(this.passwordAdmin)){
            Admin person = new Admin(adminLogin);
            return person;
        }
        else if(login.equals(this.clientLogin) && password.equals(this.passwordAdmin)){
            Client person = new Client(null);
            return person;
        }
        else if(login.equals(this.securityGuardLogin) && password.equals(this.passwordAdmin)){
            SecurityGuard person = new SecurityGuard(null);
            return person;
        }
        else if(login.equals(this.barmanLogin) && password.equals(this.passwordAdmin)){
            Barman person = new Barman(null);
            return person;
        }

        return null;
    }

    public String signOut(){
        
        return "0";
    }
}