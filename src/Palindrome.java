

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//creating the Scanner instance
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input a number of more than one 2 digits:"); // because a 2 digits number will neverbe equal when reversed
		
		int inputNum = scan.nextInt();
		
		myPalindrome(inputNum);
	}
	
	
	public static void myPalindrome(int num) {
		
		// using Dividend, Divisor, Quotient and remainder fomular
		int dividend, remainder = 0, reverseNum = 0;
		
		dividend = num; // use a temp var dividend so as not to affect the num when comparing
		
		while(dividend >0) {
			remainder = dividend % 10; // get remainder using mod10
			dividend = dividend /10;  // get quotient by taking passing just the integer
			reverseNum = (reverseNum*10)+ remainder;
		}
			
			System.out.println(reverseNum);
			
			if (num == reverseNum) {
				System.out.println("This number is a Palindrome");
			}
			else {
				System.out.println("This number is not a Palindrome");			
			}		
	}
}

