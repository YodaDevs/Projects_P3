package app.views.loginscreen;

import app.person.*;
import app.data.UserSingleton;
import app.views.adminscreen.*;

public class AdminConcreteStrategy extends LoginStrategy {

    private AdminScreen admin = null;
    UserSingleton userAdmin = UserSingleton.getInstance();
    
    public AdminConcreteStrategy(Person adminPerson){
        this.admin = new AdminScreen();
        this.userAdmin.setUser(adminPerson);
    }
    
    public AdminScreen getAdmin() {
        return this.admin;
    }

    @Override
    public void loginSelect() {
        getAdmin().startAdminScreen();
    }

    

}