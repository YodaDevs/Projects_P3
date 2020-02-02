package app.views.loginscreen;

public class ExitConcreteStrategy extends LoginStrategy{

    @Override
    public void loginSelect() {
        System.out.println("Sorry, but it's incorrect CPF or Password, try again");
    }

}