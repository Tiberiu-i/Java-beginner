import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean first = true;

        for (int i = 2; i <= n; i++) {
            int counter = 0;
            while (n % i == 0) {
                counter++;
                n /= i;
            }

            if (!first && counter != 0) {
                System.out.print(" * ");
            }

            if (counter == 1) {
                System.out.print(i);
                first = false;
            } else if (counter > 1) {
                System.out.print(i + "^" + counter);
                first =false;
            }

        }
    }
}
