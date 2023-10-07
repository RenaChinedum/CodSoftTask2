package org.rena;

import java.util.Scanner;

public class StudentGradeCalculator {
    public void calculateGrade(){
        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int totalMarks = 0;
        double averagePercentage;
        String grade;

        System.out.println("Enter total number of Subjects");

        numberOfSubjects = sc.nextInt();

        for (int subject = 1; subject <= numberOfSubjects ; subject++) {
            int marks;
            do {
                System.out.println("Enter marks obtained in " + subject +": ");
                marks = sc.nextInt();
                if(marks < 0 || marks > 100){
                    System.out.println(" Marks must be between 0 and 100. Please enter a valid mark");
                }
            }while (marks < 0 || marks> 100);


            totalMarks += marks;
        }

        averagePercentage = (double) totalMarks /numberOfSubjects;
        if (averagePercentage >= 90){
            grade = " A+";
        }else if (averagePercentage >= 80){
            grade = " A";
        } else if (averagePercentage >= 70) {
            grade = " B";
        } else if (averagePercentage >= 60) {
           grade = " C";
        } else if (averagePercentage >= 50) {
            grade = " C";
        }else {
            grade = " F";
        }
        System.out.println("\nRemarks:");
        System.out.println("Number of Subjects: " + numberOfSubjects);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: "+ grade);

        sc.close();

    }
}
