package day14;

/**
 * @author David Liotta
 *
 *This is a class that is made to find the largest absolute difference between integers in an array
 */

class Difference{
	private int[] elements;
	public int maximumDifference;
	
	public Difference(int[] el) {
		this.elements = el;
	}
	
	public int computeDifference() {
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length; j++) {
				int temp = elements[i] - elements[j];
				if(temp > maximumDifference)
					maximumDifference = temp;
			}
		}
		return maximumDifference;
	}
}
