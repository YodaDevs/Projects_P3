package app;

import app.views.homescreen.*;

public class App {
    public static void main(String[] args) throws Exception {
        HomeContext homescreen = new HomeContext();
        homescreen.startHomeStrategy();
        homescreen.cleanHomeContext();
    }
}