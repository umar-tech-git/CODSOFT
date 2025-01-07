package p1;

import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
// Input the number of subjects
		System.out.print("Enter the number of subjects: ");
		int numberOfSubjects = scanner.nextInt();
		
// Array to store marks for each subject
		int[] marks = new int[numberOfSubjects];
		int totalMarks = 0;
		
// Input marks for each subject
		for (int i = 0; i < numberOfSubjects; i++) {
			System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
			marks[i] = scanner.nextInt();
			totalMarks += marks[i];
		}
		

		double averagePercentage = (double) totalMarks / numberOfSubjects;
		
// Determine grade based on average percentage
		String grade;
		if (averagePercentage >= 90) {
			grade = "A+ EXCELLENT!";
		} else if (averagePercentage >= 80) {
			grade = "A VERY GOOD!";
		} else if (averagePercentage >= 70) {
			grade = "B+ NOT BAD GROW UP!";
		} else if (averagePercentage >= 60) {
			grade = "B NEED'S MORE EFFECT! ";
		} else if (averagePercentage >= 50) {
			grade = "C CONCENTRATE ON STUDYS!";
		} else {
			grade = "F SORRY";
		}
		

		System.out.println("\n--- Results ---");
		System.out.println("Total Marks Obtained: " + totalMarks);
		System.out.println("Average Percentage Obtained: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);
		
		scanner.close();
	}

}

     