package daysOfCode;

import java.util.Scanner;

/**
 * @author David Liotta
 * 
 * A program that takes in an integer of the amount of words you would like to read
 * then reads the inputed words and prints out the even and odd characters
 */

public class day06 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int words = sc.nextInt();
		String output = "";
		String s;
		
		for(int i = 0; i < words; i++) {
			String even = "";
			String odd = "";
			s = sc.next();
			for(int e = 0; e < s.length(); e = e + 2)
				even = even + s.charAt(e);
			for(int o = 1; o < s.length(); o = o + 2)
				odd = odd + s.charAt(o);
			output += even + " " + odd + "\n";
		}
		sc.close();	
		System.out.print(output);
			
	}
}
