package app.views.loginscreen;

import app.Person;
import app.data.UserSingleton;
import app.views.securityguardscreen.SecurityGuardScreen;

public class SecurityGuardConcreteStrategy extends LoginStrategy {

    private SecurityGuardScreen guard = null;
    UserSingleton userBarman = UserSingleton.getInstance();
    
    public SecurityGuardConcreteStrategy(Person guardPerson){
        this.guard = new SecurityGuardScreen();
        this.userBarman.setUser(guardPerson);
    }
    
    public SecurityGuardScreen getBarman() {
        return this.guard;
    }

    @Override
    public void loginSelect() {
        getBarman().startAdminScreen();
    }

}