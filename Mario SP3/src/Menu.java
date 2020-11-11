/*
@Oliver Jenbo
@Julius Krüger
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Pizza> pizzas;

    //Her laves menu, så den indeholder Pizza Arrayet
    //og den kan læse filen med pizzaerne
    public Menu() {
        pizzas = new ArrayList<>();
        readFile();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    //Her finder arrayet pizzaerne nummer, der bruges
    //når man opretter en ny ordre
    public Pizza getPizzaById(int pizzaId) {

        Pizza pizzaRetValg = null;
        for (Pizza pizza : pizzas) {

            if (pizza.getPizzaId() == pizzaId) {
                return pizza;
            }
        }
        return pizzaRetValg;
    }

    // denne metode, læser filen hvor alle pizzerne er
    public void readFile() {
        try {
            File myMenu = new File("resources\\PizzaMenu.csv");
            Scanner myReader = new Scanner(myMenu);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                String[] dataArray = data.split(",");
                //int pizzaId, String name, String ingredients, int price
                Pizza pizza = new Pizza(Integer.valueOf(dataArray[0]), dataArray[0],
                        dataArray[0], Integer.valueOf(dataArray[0]));
                pizzas.add(pizza);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}