package Harshal_Day6_Assignment_part2;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Month");
        int month = sc.nextInt();
		System.out.println("Enter Day");
        int day = sc.nextInt();
		System.out.println("Enter Year");
        int year = sc.nextInt();
        String dayOfWeek =   dayOfWeek(month,day,year);
        System.out.println("The day is::"+dayOfWeek);

	}
    public static String dayOfWeek(int m, int d, int y) {
        y = y-(14-m)/12;
        int x = y+(y/4)-(y/100) + (y/400);
        m= m+12*((14-m)/12)-2;
        d=(d+x+(31*m)/12)%7;
      switch (d){
          case 0:
              return "Sunday";
              
          case 1:
        	  return "Monday";
          case 2:
        	  return "Tuesday";
          case 3:
        	  return"Wednesday";
          case 4:
        	  return"Thrushday";
          case 5:
        	  return"Firday";
          case 6:
        	  return"Saturday";
      }
      return null;
    }
}
