package week01.day01;

public class Task3_StringComparison {
    public static void main(String[] args) {
        String a =  "java";
        String b =  "java";
        System.out.println(a == b); //guess: true
        System.out.println(a.equals(b)); //guess: true

        String c = new String("java");
        System.out.println(a == c); //guess: false
        System.out.println(a.equals(c)); //guess: true

        String input = "    Java     ";
        String expected = "Java";
        System.out.println(input == expected); //guess: false
        System.out.println(input.equals(expected)); //guess: false
        System.out.println(input.trim().equals(expected)); //guess: true

        String userInput = "ADMIN";
        String correctRole = "admin";
        System.out.println(userInput.equals(correctRole)); //guess: false
        System.out.println(userInput.equalsIgnoreCase(correctRole)); //guess: true

    }
}
