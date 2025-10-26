import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int positivenumbers = 0;

        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            if (number >= 0) {
                positivenumbers++;
            }
        }
        System.out.println("Numere pozitive: "  + positivenumbers + "\nNumere negative: " + (n - positivenumbers));
    }
}
