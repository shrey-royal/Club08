import java.util.Scanner;

import restaurant.Menu;
import restaurant.Order;

public class RestaurantProgram {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Indian Vegetarian Restaurant!");
        menu.displayMenu();

        System.out.print("\nHow many items would you like to order? ");
        int maxItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(maxItems);

        for (int i = 0; i < maxItems; i++) {
            System.out.print("Enter the name of the item: ");
            order.addItem(sc.nextLine());
        }

        order.displayOrder(menu);

        sc.close();
    }
}
