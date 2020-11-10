/*
@Julius
 */

// Når de aktive ordre er hentet skal de arkiveres og rykkes hen til inaktive ordre og ligges ind som liste.
// på denne måde er det muligt for Mario og lave statistik på disse ordre.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bestillinger {

    List<Order> orders = new ArrayList<>();

    public void addOrderToOrders(Order order) {
        orders.add(order);
    }

    public void readOrdersFromFile() {

        //read from file
        try {
            FileInputStream readData = new FileInputStream("resources\\InactiveOrders.csv");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            readStream.close();

            System.out.println(orders.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOrdersToFile() {

        //write to file
        try {
            FileWriter writeData = new FileWriter("resources\\InactiveOrders.csv");
            BufferedWriter writeStream = new BufferedWriter(writeData);
            String line = "";

            for (Order o : orders) {
                writeStream.write(o.toString());
                writeStream.newLine();
            }

            writeStream.close();
            writeData.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Bestillinger{" +
                "orders=" + orders +
                '}';
    }

    public List<Order> getOrders() {
        return orders;
    }
}
