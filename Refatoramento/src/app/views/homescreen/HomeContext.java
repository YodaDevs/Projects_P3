package app.views.homescreen;

import app.ExceptionHandling;
import app.data.*;

public class HomeContext {
     
    private HomeStrategy homeStrategy = new ExitConcreteStrategy();
    Data dataList = Data.getInstance();
     
    public void configureHome() {
        getHomeStrategy().importData(getDataList());
        getHomeStrategy().homeSelect();
    }
 
    public HomeStrategy getHomeStrategy() {
        return this.homeStrategy;
    }

    public void setHomeStrategy(HomeStrategy homeStrategy) {
        if (homeStrategy == null) return;
        this.homeStrategy = homeStrategy;
    }

    public Data getDataList() {
        return this.dataList;
    }

    public void cleanHomeContext(){
        this.homeStrategy = new ExitConcreteStrategy();
    }
 
    public void startHomeStrategy() {  

        System.out.println("(1) - Sign in");
        System.out.println("(0) - Exit");
    
        if(ExceptionHandling.readInt() == 1){
            setHomeStrategy(new SignConcreteStrategy());
            configureHome();
        }

        configureHome();
    }
 
}