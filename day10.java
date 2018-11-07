package daysOfCode;

/**
 * @author David Liotta
 * 
 * This class was made to see how many consecutive 1's there are in a 
 * binary number converted from base 10
 */
import java.util.Scanner;

public class day10 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n, 2);
		//System.out.println(s);
		
		int j = 0;
		int t = 0;
		
		for(char cr : s.toCharArray()) {
			if(cr == '1') {
				j++;
				if(j >= t)
					t = j;
			}else
				j = 0;
		}
		System.out.println(t);
	}
}


