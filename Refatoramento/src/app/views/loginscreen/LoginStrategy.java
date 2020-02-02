package app.views.loginscreen;

import app.data.*;

public abstract class LoginStrategy {

    public Data dataList = null;

    public void setDataList(Data dataList) {
        this.dataList = dataList;
    }
    
    public Data getDataList() {
        return this.dataList;
    }

    public void importData(Data dataList){
        setDataList(dataList);
    }

    /* 
     *   
     *      Abstract methods
     * 
     */

    public abstract void loginSelect();
     

}