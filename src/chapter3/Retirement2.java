package chapter3;

import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop.
 * @version 1.20 2016-08-11
 * @author ’≈”Ó∑…
 */
public class Retirement2 {
	public static void main(String[] args) {
		// read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.print("How mucn money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %:");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		// update account balance while goal isn't reached.
		do {
			// add this year's payment and interest.
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			year++;
			
			// print current balance
			System.out.printf("After year %d, your balance is %,.2f%n", year, balance);
			
			// ask if read to retire and get input.
			System.out.print("Read to retire? (Y/N)");
			input = in.next();
		} while(input.equals("N"));
		
		in.close();
	}
}
