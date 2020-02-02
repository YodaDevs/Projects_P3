package app.views.homescreen;

import app.views.loginscreen.*;

public class SignConcreteStrategy extends HomeStrategy {
    
    private LoginContext login = new LoginContext();
    
    public LoginContext getLogin() {
        return this.login;
    }

    @Override
    public void homeSelect() {
        getLogin().setDataList(getDataList());
        getLogin().startHomeStrategy();
    }
     
}