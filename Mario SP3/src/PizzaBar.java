//Annika
/* her har vi lavet vores controller, så Alfonso og Mario
kan se ordrene, se menuen, oprette nye ordre, se tidligere ordre og lukke
for programmet, når de er færdige
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaBar {

    Bestillinger bestillinger = new Bestillinger();
    Menu menu = new Menu();
    Ui ui = new Ui();
    ArrayList<Order> orderServices = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    int choice = 0;
    int value = 6;


    public void runProgram() {

        while (choice != value) {

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    seeMenu();
                    runProgramPrint();
                    break;
                case 2:
                    newCostumerAndOrder();
                    runProgramPrint();
                    break;
                case 3:
                    seeActiveOrder();
                    runProgramPrint();
                    break;
                case 4:
                    seeInactiveOrder();
                    runProgramPrint();
                    break;
                case 5:
                    moveOrder();
                    runProgramPrint();
                case 6:
                    value = exit();
                    break;
                default:
                    choice = value;
            }

        }
    }
    //Denne metode gør det muligt at se alle pizzaerne
    private void seeMenu() {
        menu.readFile();

        for (Pizza pizza : menu.getPizzas()) {
            System.out.println(pizza);
        }

    }

    // her oprettes en ny kunde og deres bestilling
    private void newCostumerAndOrder() {
        Customer customer = new Customer(1, 1, "");
        ui.newCustommer(customer);

        Ui ui = new Ui();
        Order order = new Order(customer);

        ui.newOrder(order, menu);
        orderServices.add(order);

    }
    //her ses alle de aktive ordre
    private void seeActiveOrder() {

    }
    //her kan de tidligere ordre ses
    private void seeInactiveOrder() {
        bestillinger.readOrdersFromFile();

    }
    // her bliver de aktive ordre, der er afhentet flyttet
    private void moveOrder() {
        bestillinger.writeOrdersToFile();

    }
    // dette er exit metoden.
    // den bruges til at lukke for programmet helt
    private int exit() {
        int exitChoice = 1;
        int exitValue = 2;
        while (exitChoice != exitValue) {
            System.out.println("Do you want to exit? press 7, else press 1");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    return 1;


                default:
                    return 2;
            }
        }
        return 1;
    }
    //denne metode gør så når man feks har lavet en ny kunde
    //og ordre, så får man controller menuen op igen, så man kan vælge igen
    private void runProgramPrint() {
        System.out.println(
                "Press 1 to see menu" + '\n' +
                        "Press 2 to see costumers and orders" + '\n' +
                        "Press 3 to see active orders" + '\n' +
                        "Press 4 to see previous orders" + '\n' +
                        "Press 5 to move order from active to previous" + '\n' +
                        "Press 6 to exit program");
    }

}