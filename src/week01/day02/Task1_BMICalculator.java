package week01.day02;

import java.util.Scanner;

public class Task1_BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BMI Calculator ===");

        System.out.print("Height Input (m): ");
        double height = sc.nextDouble();

        System.out.print("Weight Input (kg): ");
        double weight = sc.nextDouble();

        //Calculate BMI
        double bmi = weight / (height * height);
        System.out.println("BMI: " + String.format("%.2f",bmi));

        if(bmi < 18.5) {
            System.out.println("==> UnderWeight");
        }else if(18.5 <= bmi && bmi < 24.9) {
            System.out.println("==> Normal");
        }else if(25.0 < bmi && bmi < 29.9) {
            System.out.println("==> OverWeight");
        }else{
            System.out.println("==> Obesity");
        }
    }
}
