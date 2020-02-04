package app.person;

import java.util.ArrayList;
import app.*;

public abstract class Person {

    public abstract void setName(String name);
    public abstract void setCPF(String CPF);
    public abstract void setPassword(String password);
    public abstract String getName();
    public abstract String getCPF();
    public abstract String getPassword();
    public abstract void add();
    public abstract void remove();
    public abstract String toString();

    public static String imprimeCPF(String CPF) {
        return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
        CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
    }

    public void printArrayDrinks(ArrayList<Drinks> list) {
        if(!list.isEmpty()){
            for(int i = 0; i < list.size(); i++) {   
                System.out.print(list.get(i).toString());
            }
            System.out.println();
        }
    }

}