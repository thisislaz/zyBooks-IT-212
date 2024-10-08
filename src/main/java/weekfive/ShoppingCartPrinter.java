package weekfive;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());
        scnr.nextLine(); // Consume the leftover newline after nextInt()
        System.out.println();

        // Get item 2 details from user, create itemToPurchase object
        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());

        // Add costs of two items and print total
        int item1TotalCost = item1.getPrice() * item1.getQuantity();
        int item2TotalCost = item2.getPrice() * item2.getQuantity();
        // cartTotal = item one price + item two price
        cartTotal = (int) item1TotalCost + (int) item2TotalCost;
        // Total Cost
        System.out.println("TOTAL COST");
        // item one information
        System.out.println(item1.getName()+" "+item1.getQuantity()+" @ $"+item1.getPrice()+" = $"+item1TotalCost);
        // item two information
        System.out.println(item2.getName()+" "+item2.getQuantity()+" @ $"+item2.getPrice()+" = $"+item2TotalCost);
        // Total output
        System.out.println();
        System.out.println("Total: $"+cartTotal);

        return;
    }
}
