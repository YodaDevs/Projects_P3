package app.views.loginscreen;

import app.Person;
import app.data.UserSingleton;
import app.views.clientscreen.ClientScreen;

public class ClientConcreteStrategy extends LoginStrategy {
    
    private ClientScreen barman = null;
    UserSingleton userBarman = UserSingleton.getInstance();
    
    public ClientConcreteStrategy(Person clientPerson){
        this.barman = new ClientScreen();
        this.userBarman.setUser(clientPerson);
    }
    
    public ClientScreen getBarman() {
        return this.barman;
    }

    @Override
    public void loginSelect() {
        getBarman().startAdminScreen();
    }
}