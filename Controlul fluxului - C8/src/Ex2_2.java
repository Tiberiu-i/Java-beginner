import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int div7Count = 0;
        int sumDiv5Count = 0;
        int lastDigit379Count = 0;
        int digitCount = 0;
        int firstDigit2Count = 0;

        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                digitCount++;
            }
            if (number % 7 == 0) {
                div7Count++;
            }
            if (number % 10 == 3 || number % 10 == 7 || number % 10 == 9) {
                lastDigit379Count++;
            }
            int digitSum = 0;
            while (number != 0) {
                digitSum += number % 10;
                digitCount++;
                if (number == 2) {
                    firstDigit2Count++;
                }
                number /= 10;
            }
            if (digitSum % 5 == 0) {
                sumDiv5Count++;
            }
        }
        System.out.println("Numere divizibile cu 7: " + div7Count);
        System.out.println("Numere care au suma cifrelor divizibila cu 5: " + sumDiv5Count);
        System.out.println("Numere care au ultima cifra 3, 7 sau 9: " + lastDigit379Count);
        System.out.println("Numarul total de cifre ale numerelor: " + digitCount);
        System.out.println("Numere care au prima cifra 2: " + firstDigit2Count);
    }
}
