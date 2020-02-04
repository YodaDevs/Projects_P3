package app.views.loginscreen;

import app.ExceptionHandling;
import app.Person;
import app.data.*;
import app.persontypes.*;

public class LoginContext {
     
    private LoginStrategy loginStrategy = null;
    private DataSingleton dataLists = DataSingleton.getInstance();
     
    public void configureHome() {
        getHomeStrategy().loginSelect();
    }

    public LoginStrategy getHomeStrategy() {
        return this.loginStrategy;
    }

    public void setLoginStrategy (LoginStrategy login) {
        this.loginStrategy = login;
    }
 
    public boolean configureloginStrategy(Person user) {
        if ( user == null){ 
            System.out.println("Sorry, but it's incorrect CPF or Password, try again");
            return false;
        }
        if( user instanceof Admin) {
            setLoginStrategy(new AdminConcreteStrategy(user));
        }
        else if( user instanceof Client){
            setLoginStrategy(new ClientConcreteStrategy(user));
        }
        else if(user instanceof Barman){
            setLoginStrategy(new BarmanConcreteStrategy(user));
        }
        else if(user instanceof SecurityGuard){
            setLoginStrategy(new SecurityGuardConcreteStrategy(user));
        }
        return true;
    }
    public void cleanLoginContext(){
        this.loginStrategy = null;
    }

    public void startHomeStrategy() {
        
        dataLists.fakeData();
        
        while(true){

            System.out.println("CPF:");
            String cpf = ExceptionHandling.readString();

            System.out.println("Password:");
            String password = ExceptionHandling.readString();

            if(configureloginStrategy(dataLists.getUserFromTheList(cpf, password))){
                configureHome();
                cleanLoginContext();    
                break;
            }

        }
    }
 
}