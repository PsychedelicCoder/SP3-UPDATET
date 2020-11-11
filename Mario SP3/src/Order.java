/*
@Annika R Jespersen
@Oliver Jenbo
@Julius Krüger
*/


import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.io.*;
import java.util.List;

//klassen implementere Serializable for at readfile og
//writefile kan bruges

public class Order implements Serializable {

    Bestillinger bestillinger = new Bestillinger();
    List<Pizza> pizzas;

    String pizza;
    int price;
    Timestamp timeForOrder;
    Timestamp pickupTime;
    Customer customer;
    Timestamp timestamp = new Timestamp(new Date().getTime());

    // her laves en ordre ud fra kunde og sættes derefter ind i et array
    public Order(Customer customer) {
        pizzas = new ArrayList<>();
        this.customer = customer;
    }

    //her tilføjes en pizza til ordren
    public void addPizzaToOrder(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    //tidsmetoder
    //Denne metode udregner hvad tid ordren er lagt
    private Timestamp calculateTimeForOrder() {
        Date date = new Date();
        timeForOrder = new Timestamp(date.getTime());
        return timeForOrder;
    }

    //Her udregnes tiden for pickup
    //vi importer Calendar for at kunne bruge .Hour
    private Timestamp pickupTime(){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(timestamp.getTime());
        cal.add(Calendar.HOUR, 1);
        timestamp = new Timestamp(cal.getTime().getTime());
        return timestamp;
    }

}