public class Pizza {
    // 1,"Vesuvio","Tomatsauce, ost, skinke og oregano",57

    int pizzaId;
    String name;
    String ingredients;
    int price;

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
}
