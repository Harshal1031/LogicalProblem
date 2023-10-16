package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter the loan duration in years (Y): ");
        int Y = scanner.nextInt();

        System.out.print("Enter the annual interest rate (R): ");
        double R = scanner.nextDouble();


        double monthlyPayment = calculateMonthlyPayment(P, Y, R);

        System.out.println("Monthly Payment: Rs: " + monthlyPayment);
	}

    public static double calculateMonthlyPayment(double P, int Y, double R) {
        int n = Y * 12;
        double r = (R / 100) / 12;
        
       // double denominator = Math.pow(1 + r, n) - 1;
        double monthlyPayment = (P * r) /( (Math.pow(1 + r, n) - 1) * (1 + r));
        return monthlyPayment;
    }


}
