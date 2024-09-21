package weekone;

import java.util.Scanner;

public class CarLeastCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int downpayment;
        int paymentPerMonth;
        int numMonths;
        int totalCost;

        System.out.print("Enter downpayment amount: ");
        downpayment = sc.nextInt();

        System.out.println("Enter payment per month: ");
        paymentPerMonth = sc.nextInt();

        System.out.println("Enter number of months: ");
        numMonths = sc.nextInt();

        totalCost = downpayment + (paymentPerMonth * numMonths);
        System.out.println("Total cost: " + totalCost);


    }
}