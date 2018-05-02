package daysOfCode;

/**
 * @author David Liotta
 */

import java.util.Scanner;

public class day02 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        
        double tip = (tip_percent * 0.01) * meal_cost;
        double tax = (tax_percent * 0.01) * meal_cost;
        int total = (int) Math.rint(meal_cost + tip + tax);
        
        System.out.print("The total meal cost is " + total + " dollars.");
        
    }
}
