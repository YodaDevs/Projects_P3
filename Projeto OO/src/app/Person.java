package app;

import java.util.ArrayList;

public interface Person {

    public void setName(String name);
    public void setCPF(String CPF);
    public String getName();
    public String getCPF();
    public void add(Person name,ArrayList<Person> listA);
    public void remove(String person, ArrayList<Person> listA);
    public String toString();

}