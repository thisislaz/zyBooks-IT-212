package weekone;


import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear;
        int birthMonth;

        birthMonth = sc.nextInt();
        birthYear = sc.nextInt();
        System.out.println(birthMonth+"/"+birthYear);

    }
}