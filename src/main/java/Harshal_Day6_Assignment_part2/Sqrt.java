package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        double c = sc.nextDouble();
        double sqrt=   sqrt(c);
	}

	public static double sqrt(double c) {
        if (c<0){
            System.out.println("Invaliad Input");
        }
         double t = c;
        double epsilon=1e-15;

        while (Math.abs(t - c/t) > epsilon*t){
            t = (c/t+t)/2;
        }

        System.out.println("Square Root of "+c+" is = "+t);
		return t;
	}

}
