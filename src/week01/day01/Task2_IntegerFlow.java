package week01.day01;

public class Task2_IntegerFlow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Max value: " + max);
        int min = Integer.MIN_VALUE;
        System.out.println("Min value: " + min);

        int overflow = max + 1;
        System.out.println("Overflow value: " + overflow);

        long bigNumber = 3000000000L;
        int shrink = (int) bigNumber;
        System.out.println("Srink: " + shrink);

        int a =  1_000_000;
        int b =  1_000_000;
        int product = a*b;
        System.out.println("Product = " + product);

        long correctProduct = (long) a*b;
        System.out.println("Correct Product = " + correctProduct);
    }
}
