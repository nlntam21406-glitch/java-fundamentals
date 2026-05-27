package week01.day02;

import java.util.Scanner;

public class Task2_MoneyExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount (VND): ");
        int total_amount = sc.nextInt();

        System.out.println("=== Money Exchange ===");
        System.out.println("Amount of Money: " + total_amount);

        int[] money =  {500_000, 200_000, 100_000,
                        50_000, 20_000, 10_000,
                        5_000, 2_000, 1_000};

        int count = 0;
        for (int i = 0; i < money.length; i++) {
            int quantity = total_amount / money[i];
            if(quantity > 0) {
                System.out.println("The quantity of " + money[i] + "(vnd): " + quantity);
            }
            total_amount = total_amount % money[i];
            count += quantity;
        }
        System.out.println("The total number is: " + count + " sheet(s)");
    }
}
