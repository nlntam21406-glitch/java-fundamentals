package week01.day04;

import java.util.Scanner;
public class Task2_PrimeNumbers {
    public static int checkCount = 0;
    public static int sumCheckCount = 0;
    public static int checkCountNaive = 0;

    public static boolean isPrime(int n) {
        checkCount++;
        if (n <= 1) return false;

        checkCount++;
        if (n == 2) return true;

        checkCount++;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            checkCount++;
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int x) {
        int count = 0;
        for(int i = 2; i <= x; i++){
            sumCheckCount++;
            if(isPrime(i)) {
                String y = i + " ";
                System.out.printf("%-5s", y);
                count++;
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.print("Total of prime numbers: " + count);
    }

    public static boolean isPrimeNaive(int n) {
        checkCountNaive++;
        if(n <= 1) return false;

        for(int i = 2; i < n; i++) {
            checkCountNaive++;
            if(n % i == 0) return false;
        }
        return true;
        /* Do Naive phai duyet tat ca cac so tu 2 den n
        nen no se ton nhieu buoc hon so voi cach Normal */
    }

    public static void findLargestPrimeUnder1000() {
        int n = 999;
        while(n >= 2) {
            if(isPrime(n)) {
                System.out.println("Largest Prime number under 1000 is: " + n);
                break;
            }
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want check: ");
        int num = sc.nextInt();

        //Normal
        System.out.println("-----Normal-----");
        if(isPrime(num)) {
            System.out.println("=> Is Prime!!!");
        }else{
            System.out.println("=> Not Prime!!!");
        }
        System.out.println("Check count: " + checkCount);

        //Naive
        System.out.println("-----Naive-----");
        if(isPrimeNaive(num)) {
            System.out.println("=> Is Prime!!!");
        }else{
            System.out.println("=> Not Prime!!!");
        }
        System.out.println("Check count Naive: " + checkCountNaive);

        if(checkCount > checkCountNaive) {
            System.out.println("==> Normal slower than Naive");
        }else{
            System.out.println("==> Normal faster than Naive");
        }

        System.out.print("Enter the limit Prime number you want print: ");
        int x = sc.nextInt();
        printPrime(x);
        System.out.println();
        System.out.println("Sum of check count: " + sumCheckCount);

        findLargestPrimeUnder1000();
    }
}
