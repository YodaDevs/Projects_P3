package app.views.homescreen;

import app.data.*;

public abstract class HomeStrategy {
    
    public Data dataList = null;

    public void setDataList(Data dataList) {
        this.dataList = dataList;
    }

    public Data getDataList() {
        return this.dataList;
    }

    public abstract void homeSelect();

    public void importData(Data dataList){
        setDataList(dataList);
    }
     
}