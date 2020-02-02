package app.views.adminscreen.options;

import app.views.adminscreen.*;

public class Option1 extends AdminStrategy {

    @Override
    public void adminSelect() {
        System.out.println("(1) - Add People"); 
        System.out.println("(2) - Add Drinks"); 
        
    }

}