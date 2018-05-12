package day12;

/**
 * @author David Liotta
 * 
 * The purpose of this class is to define what a student is and a way of calculating
 * what grade the student is going to recive
 */
import java.lang.reflect.Array;

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName, String lastName, int idNumber,int[] scores) {
		super(firstName, lastName, idNumber);
		this.testScores = scores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate() {
		char lGrade = 0; 	//Letter grade
		int tGrade = 0;		//Total grade
		int aGrade;		//Average grade
		for(int i = 0; i < testScores.length; i++) {
			tGrade += testScores[i];
		}
		aGrade = tGrade / testScores.length;
		if(aGrade >= 90 && aGrade <= 100)
			lGrade = 'O';
		else if(aGrade >= 80 && aGrade < 90)
			lGrade = 'E';
		else if(aGrade >= 70 && aGrade < 80)
			lGrade = 'A';
		else if(aGrade >= 55 && aGrade < 70)
			lGrade = 'P';
		else if(aGrade >= 40 && aGrade < 55)
			lGrade = 'D';
		else
			lGrade = 'T';
		return lGrade;
	}
}




