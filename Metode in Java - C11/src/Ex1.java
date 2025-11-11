import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printPrime(sc.nextInt());

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int number) {
        if (number < 2) {
            System.out.println("empty");
        }
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
