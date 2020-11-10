/*
@Jenbo
 */

// Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    List<Pizza> pizzas;

    public Menu() {
        pizzas = new ArrayList<>();
        readFile();
    }


    // Der skal være et text document, hvor man skal kunne tilføje flere Pizza'er,
// der er allerede givet de første 14 Pizza'er, vi skal så tilføje resten til vi rammer 30.
// Denne klasse skal kunne læse dette text document.


    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public Pizza getPizzaById(int pizzaId) {

        Pizza pizzaRetValg = null;
        for (Pizza pizza : pizzas) {

            if (pizza.getPizzaId() == pizzaId) {
                return pizza;
            }
        }
        return pizzaRetValg;
    }


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
