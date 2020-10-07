package firstTask;

import java.util.Scanner;

import static java.lang.String.format;

public class Palindrome {
    public static boolean isPalindrome(int number) {
        Integer initialNumber = number;
        int reverseNumber = 0;

        if (number >= 0) {
            while (number != 0) {
                reverseNumber *= 10;
                reverseNumber += number % 10;
                number /= 10;
            }
        }
        return initialNumber.equals(reverseNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        System.out.println(format("Is palindrome: %b", isPalindrome(number)));
    }

}
