package app.views.homescreen;

public class ExitConcreteStrategy extends HomeStrategy {

    @Override
    public void homeSelect() {
        System.out.println("See you later, bye");
        System.exit(0);
    }
     
}