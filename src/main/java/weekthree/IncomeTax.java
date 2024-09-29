package weekthree;

import java.util.Scanner;

public class IncomeTax {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final String SALARY_PROMPT = "\nEnter annual salary (0 to exit): ";
        final String DEDUCTION_PROMPT = "\nEnter deduction amount (0 to exit): ";
        int annualSalary;
        int deduction;
        int totalDeductions;
        int adjustedSalary;
        double taxRate;
        int taxToPay;

        System.out.println(SALARY_PROMPT);
        annualSalary = scnr.nextInt();
        System.out.println(DEDUCTION_PROMPT);
        deduction = scnr.nextInt();

        while (annualSalary > 0) {
            // FIXME: Add a while loop to gather deductions. Use the variables
            // deduction and totalDeductions for deduction handling.
            // End the inner while loop when a deduction <= 0 is entered.
            totalDeductions = 0;
            System.out.println(DEDUCTION_PROMPT);
            deduction = scnr.nextInt();
            while ( deduction > 0) {
                totalDeductions += deduction;
                System.out.println(DEDUCTION_PROMPT);
                deduction = scnr.nextInt();
            }
            adjustedSalary = annualSalary - totalDeductions;
            // Determine the tax rate from the annual salary
            if (adjustedSalary <= 20000) {
                taxRate = 0.10;        // 0.10 is 10% written as a decimal
            }
            else if (adjustedSalary <= 50000) {
                taxRate = 0.20;
            }
            else if (adjustedSalary <= 100000) {
                taxRate = 0.30;
            }
            else {
                taxRate = 0.40;
            }

            taxToPay = (int)(adjustedSalary * taxRate);   // Truncate tax to an integer amount
            System.out.println("Annual salary: " + annualSalary);
            System.out.println("\nDeductions: " + totalDeductions);
            System.out.println("Adjusted salary after deductions: " + adjustedSalary);
            System.out.println("Tax rate: " + taxRate);
            System.out.println("Tax to pay: " + taxToPay);

            // Get the next annual salary
            System.out.println(SALARY_PROMPT);
            annualSalary = scnr.nextInt();
        }
    }
}
