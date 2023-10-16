package Harshal_Day6_Assignment_part2;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("enter the amount::");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int[] res = VendingMachine.calculateNotes(amount);
		System.out.println(Arrays.toString(res));
	}

	public static int[] calculateNotes(int amount) {
		int oneRsNote = 0;
		int twoRsNote = 0;
		int fiveRsNote = 0;
		int tenRsNote = 0;
		int fiftyRsNote = 0;
		int hundredRsNote = 0;
		int fiveHundredRsNote = 0;
		int thousandRsNote = 0;
		int totalNote = 0;
		while (amount > 0) {
			if (amount >= 1000) {
				thousandRsNote++;
				totalNote++;
				amount = amount - 1000;
			} else if (amount >= 500) {
				fiveHundredRsNote++;
				totalNote++;
				amount = amount - 500;

			} else if (amount >= 100) {
				hundredRsNote++;
				totalNote++;
				amount = amount - 100;

			} else if (amount >= 50) {
				fiftyRsNote++;
				totalNote++;
				amount = amount - 50;

			} else if (amount >= 10) {
				tenRsNote++;
				totalNote++;
				amount = amount - 10;

			} else if (amount >= 5) {
				fiveRsNote++;
				totalNote++;
				amount = amount - 5;

			} else if (amount >= 2) {
				twoRsNote++;
				totalNote++;
				amount = amount - 2;
			} else if (amount == 1) {
				oneRsNote++;
				totalNote++;
				amount = amount - 1;
			}

		}
		System.out.println("Number 1 Rs Note: " + oneRsNote);
		System.out.println("Number 2 Rs Note: " + twoRsNote);
		System.out.println("Number 5 Rs Note: " + fiveRsNote);
		System.out.println("Number 10 Rs Note: " + tenRsNote);
		System.out.println("Number 50 Rs Note: " + fiftyRsNote);
		System.out.println("Number 100 Rs Note: " + hundredRsNote);
		System.out.println("Number 500 Rs Note: " + fiveHundredRsNote);
		System.out.println("Number 1000 Rs Note: " + thousandRsNote);
		System.out.println("Total Number Of notes::" + totalNote);

		int[] res = { oneRsNote, twoRsNote, fiveRsNote, tenRsNote, fiftyRsNote, hundredRsNote, fiveHundredRsNote,
				thousandRsNote };
		return res;
	}

}
