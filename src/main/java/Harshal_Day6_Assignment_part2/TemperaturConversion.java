package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class TemperaturConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double res = TemperaturConversion.fahrenheitToCelsius(fahrenheit);
		System.out.println("the temperature in Celsius::" + res);

		System.out.println("Enter the temperature in Celsius");
		double celsius = sc.nextDouble();
		double res2=TemperaturConversion.celsiusToFahrenheit(celsius);
		System.out.println("the temperature in Fahrenheit::" + res2);

	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		;
		return celsius;

	}

	public static double celsiusToFahrenheit(double celsius ) {
		double fahrenheit = (celsius * 9 / 5) + 32;
         return fahrenheit;
	}

}
