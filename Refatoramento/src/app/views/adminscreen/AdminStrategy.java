package app.views.adminscreen;

import app.data.*;
import app.persontypes.*;

public abstract class AdminStrategy {

    public Admin admin = null;
    public Data dataList = null;

    public Admin getAdmin() {
        return this.admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

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

    public abstract void adminSelect();
     

}