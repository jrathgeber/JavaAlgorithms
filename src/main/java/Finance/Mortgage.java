package Finance;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {


    private static final int MONTHS_IN_A_YEAR = 12;


    public static void main (String...args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principle amount");
        double principal = scanner.nextDouble();

        System.out.println("Enter the inerest rate");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term ");
        int termInYears = scanner.nextInt();

        scanner.close();

        float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;

        double monthlyPayment = principal * (
                (monthlyInterestRate * (Math.pow(1+monthlyInterestRate,numberOfPayments)))
                /
                        ((Math.pow(1+monthlyInterestRate,numberOfPayments))-1)
                );

        System.out.println("Monthly payment : " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
        System.out.println("Total Payback Amount : " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

    }


}
