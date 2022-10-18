public class Main {
    public static void main(String args[]) {
        int number = 123;
        int first_Digit = 0;
        int last_Digit = 0;
        int count = 0;

        // To find the last digit of the number : taking modulo with 10
        last_Digit = number % 10;
        System.out.println("The Last digit of the given number is: " + last_Digit); 

        // To find the first digit of the number
        while (number != 0) {
            first_Digit = number % 10;
            number /= 10;
        }
        System.out.println("The First digit of the given number is: " + first_Digit);
    }
}