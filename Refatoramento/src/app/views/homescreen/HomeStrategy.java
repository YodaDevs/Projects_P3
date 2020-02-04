package app.views.homescreen;

import app.data.*;

public abstract class HomeStrategy {
    
    public DataSingleton dataList = null;

    public void setDataList(DataSingleton dataList) {
        this.dataList = dataList;
    }

    public DataSingleton getDataList() {
        return this.dataList;
    }

    public void importData(DataSingleton dataList){
        setDataList(dataList);
    }

    public abstract void homeSelect();

     
}