package Harshal_Day6_Assignment_part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num=sc.nextInt();
	       int num2=tobinary(num);

	}
		public static int tobinary(int n) {
	        int i =2;
	        int temp=0;
	        List<Integer> list = new ArrayList();
	        StringBuilder binar = new StringBuilder();
	        while ( n>0){
	            if (n%i==0){
	                binar.append('0');
	                list.add(0);
	                temp++;
	            }else{
	                binar.append('1');
	                list.add(1);
	                temp++;
	            }
	            n=n/2;
	        }

	        System.out.println(binar.reverse());

	       if (binar.length()<8){
	           binar.append(0);
	           list.add(list.size(),0);
	       }
	        System.out.println(list);
	        int mid = (list.size()/2);


	        for(int j=0;j<list.size()/2;j++) {
	            Integer temp1 = list.get(j);
	            list.set(j, list.get(mid+j));

	            list.set(j+mid, temp1);

	        }
	        System.out.println(list);
	        
	        int res =0;
	    int count=0;
	        for (int k =0;k<list.size();k++){
	            int a = (int) list.get(k);
	            int sum = (int) (Math.pow(2,count)*a);
	             res = res + sum;
	             count++;
	        }
	        System.out.println(res);
	       return res; 
	    }
			
		

}
