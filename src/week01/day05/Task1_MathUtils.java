package week01.day05;

import java.util.Scanner;
public class Task1_MathUtils {
    public static int factorial(int n) {
        int f = 1;
        if(n < 0) throw new IllegalArgumentException("n MUST >= 0");
        if(n == 0) return 1;
        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int sumOfDigits(int n) {
        n  = Math.abs(n);
        int sum = 0;
        while(n  >  0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isPerfectNum(int n) {
        int sum = 0;
        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum +=  i;
            }
        }
        if(sum == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //factorial
        System.out.print("Enter n (n!): ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print(n + "! = ");
        System.out.println(factorial(n));
        System.out.println("----------------");

        //Palindrome
        System.out.print("Enter String: ");
        String s =  sc.nextLine();
        if(isPalindrome(s.toLowerCase().replace(" ",""))) {
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
        System.out.println("----------------");

        //Sum of Digits
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Sum of Digits of " + m + " = "+ sumOfDigits(m));
        System.out.println("----------------");

        //Perfect Number
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        if(isPerfectNum(x)) {
            System.out.println(x + " is Perfect Number");
        }else {
            System.out.println(x + " is not Perfect Number");
        }
        System.out.println("----------------");
    }
}
