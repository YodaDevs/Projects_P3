package app.views.adminscreen;

import java.util.Scanner;
import app.data.*;
import app.persontypes.*;

public class AdminContext {
     
    private AdminStrategy adminStrategy = null;
    public Admin admin = null;
    Data dataList = null;
     
    public void configureAdmin() {
        getAdminStrategy().importData(getDataList());
        getAdminStrategy().setAdmin(admin);
        getAdminStrategy().adminSelect();
    }

    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
 
    public AdminStrategy getAdminStrategy() {
        return this.adminStrategy;
    }
 
    public void setloginStrategy(AdminStrategy adminStrategy) {
        if ( adminStrategy == null) return;
        this.adminStrategy = adminStrategy;
    }

    public void setDataList(Data dataList) {
        this.dataList = dataList;
    }

    public Data getDataList() {
        return this.dataList;
    }

    public void startAdminStrategy() {

        while(true) {

            System.out.println("What do you want to do?");
            System.out.println("(1) - Add"); 
            System.out.println("(2) - Edit");
            System.out.println("(3) - Remove");
            System.out.println("(4) - Show Report"); 
            System.out.println("(0) - Sign out");	

            configureAdmin();
        }
    }
 
}