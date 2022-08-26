package com.perfectNumber;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a numer to check if its perfect number or not -  ");
     int num = sc.nextInt();
     int numCheck =1;
     int sum=0;
     while(numCheck <= num/2)
     {
    	 if (num % numCheck == 0)
    	 {
    		 sum = sum + numCheck;
    	 }
    	 numCheck++;	 
     }
     sc.close();
     
     if (sum==num)
     {
    	 System.out.println("The numer is perfect number");
     }
     else
     {
    	 System.out.println("The numer is not perfect number");

     }
	}

}
