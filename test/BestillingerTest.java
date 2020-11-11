import org.junit.Test;

import java.util.List;
import java.util.Collection;

import static org.junit.Assert.*;

public class BestillingerTest {

    @Test
    public void writeOrdersToFile() {
        Bestillinger bestillinger = new Bestillinger();

        Customer cus = new Customer(1,023,"æaljd");
        Order order = new Order(cus);
        Pizza pizza = new Pizza(32, "weælmr", "wlekf", 73);
        order.addPizzaToOrder(pizza);
        bestillinger.addOrderToOrders(order);
        bestillinger.writeOrdersToFile();
    }
}