/*
@Oliver Jenbo
@Julius Krüger
 */

public class Pizza {
    // 1,"Vesuvio","Tomatsauce, ost, skinke og oregano",57

    int pizzaId;
    String name;
    String ingredients;
    int price;

    Bestillinger bestillinger = new Bestillinger();

    //Konstruktør for vores pizzaer
    public Pizza(int pizzaId, String name, String ingredients, int price) {
        this.pizzaId = pizzaId;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaId=" + pizzaId +
                ", name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", price=" + price +
                '}';
    }

    //en metode til udrigning af den fulle pris af pizzaerne.
    //vi  har lagt den her fordi, det er den samlede pris for alle pizzaerne.
    //vi bruger metoden inde i klassen "Orders".
    public int totalPrice() {
        price = 0;
        for (int i = 0; i < bestillinger.getOrders().size(); i++) {
            price += price;

        }
        return price;
        //Pris metode.
        //kan udregne prisen for alle pizzaerne i ordrene.

    }


}