package weekthree;

import java.util.Scanner;

public class AutoBuilder {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char keepBidding;
        int nextBid;

        nextBid = 0;
        keepBidding = 'y';

        while (keepBidding != 'n') {
            nextBid = nextBid + 3;
            System.out.println("I'll bid $" + nextBid + "!");
            System.out.println("Continue bidding? (y/n) ");
            keepBidding = scnr.next().charAt(0);
        }
        System.out.println("");
    }
}
