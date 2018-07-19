package day19;
/**
 * @author David Liotta
 *
 */

class Calculator implements AdvancedArithmetic {
	
	/**
	 * Method that finds the sum of all divisors of a number
	 */
    public int divisorSum(int n) {
    	int sum = 0;
    	for(int i = 1; i <= n; i++) {
    		if(n % i == 0)
    			sum += i;
    	}
        return sum;
    }
}
