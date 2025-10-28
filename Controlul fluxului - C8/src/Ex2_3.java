import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        int resultMin = 0;
        int resultMax = 0;

        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            int copyNumber = number;
            int digitCount = 0;

            while (number != 0) {
                digitCount++;
                number /= 10;
            }
            if (i == 1) {
                resultMin = copyNumber;
                resultMax = copyNumber;
                min = digitCount;
                max = digitCount;
            }
            if (digitCount < min && copyNumber != 0) {
                min = digitCount;
                resultMin = copyNumber;
            } else if (digitCount > max) {
                max = digitCount;
                resultMax = copyNumber;
            }
        }
        System.out.println("Numar minim de cifre: " + resultMin);
        System.out.println("Numar maxim de cifre: " + resultMax);
    }
}
