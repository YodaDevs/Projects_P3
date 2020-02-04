package app.views.loginscreen;

import app.data.*;

public abstract class LoginStrategy {

    public DataSingleton dataList = DataSingleton.getInstance();

    public DataSingleton getDataList() {
        return this.dataList;
    }

    /* 
     *   
     *      Abstract methods
     * 
     */

    public abstract void loginSelect();
     

}