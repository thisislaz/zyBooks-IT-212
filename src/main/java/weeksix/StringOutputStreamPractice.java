package weeksix;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class StringOutputStreamPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        int discount;

        StringWriter itemCharStream = new StringWriter();
        PrintWriter itemOutputStream = new PrintWriter(itemCharStream);

        System.out.println("Enter item name: ");
        item = scanner.next();
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();
        System.out.println("Enter discount: ");
        discount = scanner.nextInt();

        itemOutputStream.println(item + " x " + quantity);
        itemOutputStream.print(discount + "% off");

        System.out.print(itemCharStream.toString());
    }
}
