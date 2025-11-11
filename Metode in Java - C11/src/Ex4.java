import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printPalindromes(sc.nextInt());
    }

    public static void printPalindromes(int number) {
        for (int i = 0; i <= number; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int result = 0;
        int copyNumber = number;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return copyNumber == result;
    }
}
