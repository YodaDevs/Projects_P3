package app.views.loginscreen;

import java.util.Scanner;
import app.data.*;

public class LoginContext {
     
    private LoginStrategy loginStrategy = new ExitConcreteStrategy();
    Data dataList = null;
     
    public void configureHome() {
        getHomeStrategy().importData(getDataList());
        getHomeStrategy().loginSelect();
    }
 
    public LoginStrategy getHomeStrategy() {
        return this.loginStrategy;
    }
 
    public void setloginStrategy(LoginStrategy loginStrategy) {
        if ( loginStrategy == null) return;
        this.loginStrategy = loginStrategy;
    }

    public void setDataList(Data dataList) {
        this.dataList = dataList;
    }

    public Data getDataList() {
        return this.dataList;
    }

    public void startHomeStrategy() {

        while(true){

            Scanner input = new Scanner(System.in);

            System.out.println("CPF:");
            String cpf = input.nextLine();

            System.out.println("Password:");
            String password = input.nextLine();

            //setloginStrategy(getDataList().getUserFromTheList(cpf, password)); 

            configureHome();
        }
    }
 
}