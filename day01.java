package daysOfCode;

/**
 * @author David Liotta
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class day01 {
	
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        //My variables
        int x = 0;
        double y = 0.0;
        String z = "";
        
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();
		
		//Used to make sure the decimal is in the format #.#
		DecimalFormat df = new DecimalFormat("#.#");
		
		System.out.println(i + x);
		System.out.println(df.format(d + y));
		System.out.println(s + z);
				
		scan.close();
	}
}
