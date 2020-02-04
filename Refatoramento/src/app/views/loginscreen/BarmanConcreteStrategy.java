package app.views.loginscreen;

import app.person.*;
import app.data.UserSingleton;
import app.views.barmanscreen.BarmanScreen;

public class BarmanConcreteStrategy extends LoginStrategy {
    private BarmanScreen barman = null;
    UserSingleton userBarman = UserSingleton.getInstance();
    
    public BarmanConcreteStrategy(Person barmanPerson){
        this.barman = new BarmanScreen();
        this.userBarman.setUser(barmanPerson);
    }
    
    public BarmanScreen getBarman() {
        return this.barman;
    }

    @Override
    public void loginSelect() {
        getBarman().startAdminScreen();
    }

}