package daysOfCode;

import java.util.Scanner;

/**
 * @author David Liotta
 *
 *The purpose of this class is to read in an integer n and then n amount of integers, save them
 *in an array, and then print that array back iut backwards
 */
public class day07 {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        //Declaring the arrays
        int[] arr = new int[n];
        int[] rev = new int[n];
        
        for(int i = 0; i < n; i++) 
            arr[i] = in.nextInt();
        
        int p = 0;
        for(int j = n - 1; j >= 0; j--) {
        	rev[j] = arr[p];
        	p++;
        }
        
        for(int f = 0; f < n; f++)
        	System.out.print(rev[f] + " ");
        in.close();
	}

}
