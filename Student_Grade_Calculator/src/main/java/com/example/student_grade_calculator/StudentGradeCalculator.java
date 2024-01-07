package com.example.student_grade_calculator;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("   STUDENT GRADE CALCULATOR   ");
        System.out.println("==============================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Get marks for each subject
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks and average percentage
        int totalMarks = calculateTotal(marks);
        double avgPercent = calculateAverage(totalMarks, numSubjects);

        // Determine the grade based on the average percentage
        String grade = calculateGrade(avgPercent);

        // Display results
        System.out.println(" ");
        System.out.println(name + ", your total marks are: " + totalMarks);
        System.out.println("Average percentage is: " + avgPercent + "%");
        System.out.println("Your Grade is: " + grade);

        if (grade.equals("F")) {
            System.out.println("Sorry, you have failed. Better luck next time!");
        } else {
            System.out.println("Congratulations! You have passed!");
        }

        scanner.close();
    }

    // Calculate total marks
    private static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Calculate average percentage
    private static double calculateAverage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    // Determine the grade based on the average percentage
    private static String calculateGrade(double avgPercent) {
        if (avgPercent > 90) {
            return "A";
        } else if (avgPercent >= 80) {
            return "B+";
        } else if (avgPercent >= 70) {
            return "B";
        } else if (avgPercent >= 60) {
            return "C+";
        } else if (avgPercent >= 50) {
            return "C";
        } else if (avgPercent >= 40){
            return "D";
        }
        else {
            return "F";
        }
    }
}
