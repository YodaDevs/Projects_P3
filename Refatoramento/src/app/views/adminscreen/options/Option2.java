package app.views.adminscreen.options;

import app.views.adminscreen.*;

public class Option2 extends AdminStrategy {

    @Override
    public void adminSelect() {
        System.out.println("(1) - Edit People");	
        System.out.println("(2) - Edit Drinks");
        
    }

}