package app.views.loginscreen;

import app.views.adminscreen.*;

public class AdminConcreteStrategy extends LoginStrategy {
    
    private AdminContext admin = new AdminContext();
    
    public AdminContext getAdmin() {
        return this.admin;
    }

    @Override
    public void loginSelect() {
        getAdmin().setDataList(getDataList());
        //getAdmin().setAdmin(admin); admin need to extends loginStrategy
        getAdmin().startAdminStrategy();
    }

    

}