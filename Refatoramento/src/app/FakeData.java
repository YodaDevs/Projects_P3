package app;

import app.data.DataSingleton;
import app.person.adminperson.*;
import app.person.clientperson.*;
import app.person.barmanperson.*;
import app.person.securityguardperson.*;

public class FakeData {

    public void generateData(DataSingleton user){
        Drinks drink = new Drinks();
        drink.setName("Absolut Vodka");
        drink.setBrand("Absolut");
        drink.setExpirationDate("20/01/2020");
        drink.setPriceDrink(45);
        drink.setRank(8);
        drink.setTypeDrink("Vodka");

        user.getDrinksList().add(drink);

        Drinks drink1 = new Drinks();
        drink1.setName("Absolut Vodka Mango");
        drink1.setBrand("Absolut");
        drink1.setExpirationDate("20/01/2020");
        drink1.setPriceDrink(55);
        drink1.setRank(2);
        drink1.setTypeDrink("Vodka");

        user.getDrinksList().add(drink1);

        Drinks drink2 = new Drinks();
        drink2.setName("Ballantine Whisky");
        drink2.setBrand("Ballantine");
        drink2.setExpirationDate("20/01/2020");
        drink2.setPriceDrink(100);
        drink2.setRank(4);
        drink2.setTypeDrink("Whisky");

        user.getDrinksList().add(drink2);

        Drinks drink3 = new Drinks();
        drink3.setName("Duff Beer");
        drink3.setBrand("The Simpsons");
        drink3.setExpirationDate("20/01/2020");
        drink3.setPriceDrink(12);
        drink3.setRank(10);
        drink3.setTypeDrink("Beer");

        user.getDrinksList().add(drink3);

        Drinks drink4 = new Drinks();
        drink4.setName("Heineken Chopp");
        drink4.setBrand("Heineken");
        drink4.setExpirationDate("20/01/2020");
        drink4.setPriceDrink(30);
        drink4.setRank(20);
        drink4.setTypeDrink("Beer");

        user.getDrinksList().add(drink4);

        AdminAbstract adminA = new AdminPerson();
        adminA.setName("Admin");
        adminA.setCPF("02855704472");
        adminA.setPassword("123");

        user.getPersonList().add(adminA);

        Client client = new Client(null);
        client.setName("John Mayer");
        client.setCPF("67729825090");
        client.setCashClient(100);
        client.setPassword("123");
        String drinkLike = "Heineken Chopp,Duff Beer" ;
        String[] names = drinkLike.split(",");
        for(String num : names){
            client.drinkLike.add(num);
        }

        user.getPersonList().add(client);

        Client client1 = new Client(null);
        client1.setName("Michael Jackson");
        client1.setCPF("55829838052");
        client1.setCashClient(100);
        client1.setPassword("123");

        drinkLike = "Duff Beer" ;
        names = drinkLike.split(",");
        for(String num : names){
            client1.drinkLike.add(num);
        }

        user.getPersonList().add(client1);

        Client client2 = new Client(null);
        client2.setName("Turing");
        client2.setCPF("46726227035");
        client2.setCashClient(100);
        client2.setPassword("123");

        drinkLike = "Absolut Vodka, Absolut Vodka Mango" ;
        names = drinkLike.split(",");
        for(String num : names){
            client2.drinkLike.add(num);
        }

        user.getPersonList().add(client2);
        
        Barman barman = new Barman(null);
        barman.setName("Greyson");
        barman.setCPF("35688259027");
        barman.setPassword("123");

        user.getPersonList().add(barman);

        Barman barman1 = new Barman(null);
        barman1.setName("Luff");
        barman1.setCPF("94333179041");
        barman1.setPassword("123");

        user.getPersonList().add(barman1);


        SecurityGuard security = new SecurityGuard(null);
        security.setName("Tayrone");
        security.setCPF("81703978048");
        security.setPassword("123");

        user.getPersonList().add(security);

        


    }

}