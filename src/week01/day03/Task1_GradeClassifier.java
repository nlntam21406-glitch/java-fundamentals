package week01.day03;

import java.util.Scanner;

public class Task1_GradeClassifier {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Your Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Your Points: ");
        double points = sc.nextDouble();

        System.out.println("=== Grade Classifier ===");
        System.out.println("Student's name: " + fullName);
        System.out.println("Student's points: " + points);

        if(points < 0 || points > 10) {
            System.out.println("Invalid Points!!!");
        }else if(points > 9.0) {
            System.out.println("Grade:  Excellent (A+)");
        } else if(points >= 8.5 && points <= 8.9) {
            System.out.println("Grade: Good (A)");
        } else if(points >= 7.0 && points <= 8.4) {
            System.out.println("Grade: Fair (B)");
        } else if(points >= 5.5 && points <= 6.9) {
            System.out.println("Grade: Average (C)");
        } else if(points >= 4.0 && points <= 5.4) {
            System.out.println("Grade: Poor (D)");
        } else {
            System.out.println("Grade: Very Poor (F)");
        }

        String result = points >= 5.5 ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        System.out.print("Is this the second test score? [true/false]: ");
        boolean check = sc.nextBoolean();
        String conclusion = check ? "Forced to drop out of school!" : "Keep going!";
        System.out.println(conclusion);
    }
}