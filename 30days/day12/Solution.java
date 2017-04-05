package day12;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
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
    Student(String firstName, String lastName, int id, int[] testScore){
        super(firstName, lastName,  id);
        this.testScores = testScore;
    }
    char calculate(){
        int averageScore = 0;
        char grade = ' ';
        for(int i = 0 ; i < testScores.length ; i++){
            averageScore += testScores[i]; 
        }
        
        averageScore = averageScore/testScores.length;
        
        if(averageScore >= 90 && averageScore <=100){
            grade = 'O';
        }else if(averageScore >= 80 && averageScore < 90){
            grade = 'E';
        }else if(averageScore >= 70 && averageScore < 80){
            grade = 'A';
        }else if(averageScore >= 55 && averageScore < 70){
            grade = 'P';
        }else if(averageScore >= 40 && averageScore < 55){
            grade = 'D';
        }else if(averageScore < 40){
            grade = 'T';
        }
        //System.out.println(grade);
        return grade;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}
/**
 * @author: chaudharimehul
 * @date:	Apr 5, 2017
 * Sample Input

Heraldo Memelli 8135627
2
100 80
Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 */
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}