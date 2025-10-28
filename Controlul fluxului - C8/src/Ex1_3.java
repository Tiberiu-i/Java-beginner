import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        boolean containsOnlyEvenNumbers = true;
        int oddNumbersCount = 0;
        int evenNumbersCount = 0;
        int sum = 0;
        boolean contains9 = false;
        boolean endsWith379 = x % 10 == 3 || x % 10 == 7 || x % 10 == 9;
        boolean oneDigitX = x < 10;
        boolean contains1 = false;
        boolean contains0 = false;

        while (x != 0) {
            if (x % 2 == 1) {
                containsOnlyEvenNumbers = false;
                oddNumbersCount++;
            } else {
                evenNumbersCount++;
            }
            if (x % 10 == 9) {
                contains9 = true;
            }
            if (x % 10 == 0) {
                contains0 = true;
            }
            if (x % 10 == 1) {
                contains1 = true;
            }
            sum += x % 10;
            x /= 10;
        }
        System.out.println("Contine numai cifre pare? R: " + containsOnlyEvenNumbers);
        System.out.println("Contine mai multe cifre pare decat cifre impare? R: " + (evenNumbersCount > oddNumbersCount));
        System.out.println("Suma cifrelor sale este divizibila cu 5? R: " + (sum % 5 == 0));
        System.out.println("Numarul de cifre este multiplu de 3? R: " + ((oddNumbersCount + evenNumbersCount) % 3 == 0));
        System.out.println("Numarul contine cifra 9? R: " + contains9);
        System.out.println("Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: " + endsWith379);
        System.out.println("Numarul este o cifra? R: " + oneDigitX);
        System.out.println("Numarul contine cifra 1 si cifra 0? R: " + (contains0 && contains1));
    }
}
