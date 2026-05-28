package week01.day03;

import java.util.Scanner;
public class Task2_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num_1 = sc.nextDouble();
        System.out.print("Enter the operator (+ , - , * , / , %): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num_2 = sc.nextDouble();

        double result = 0;
        boolean isValid =  true;

        switch(operator) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                if (num_2 == 0) {
                    System.out.println("Invalid Calculate!!!");
                    isValid = false;
                } else {
                    result = num_1 / num_2;
                }
                break;
            case '%':
                if (num_2 == 0) {
                    System.out.print("Invalid Calculate!!!");
                    isValid = false;
                } else {
                    result = num_1 % num_2;
                }
                break;
            default:
                System.out.println("Invalid Operator!!!");
                isValid =  false;
                break;
        }

        if(isValid) {
            System.out.println("The result: " + num_1 + " " + operator + " " + num_2 + " = " + result);
        }

        sc.close();
    }
}
