package week01.day04;

import java.util.Scanner;
public class Task1_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("=================== MULTIPLICATION TABLE ==================");
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j ++) {
                String cell = i + "x" + j + "=" + (i*j);
                System.out.printf("%-8s", cell);
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Which multiplication table do you want to print?: ");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int k = 1;  k <= 9; k++) {
            System.out.print(n+"x"+k+"= ");
            System.out.printf("%-3d", n*k);
            System.out.println();
            sum += (n*k);
        }
        System.out.print("Sum of rows " + n + " = " + sum);
        sc.close();
    }
}
