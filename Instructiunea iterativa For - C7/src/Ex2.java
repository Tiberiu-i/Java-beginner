import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print("1. ");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("2. ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("3. ");
        for (int i = n - n % 2; i >= 0; i-=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("4. ");
        for (int i = 0; i <= n; i+=5) {
            System.out.print(i + " ");
        }
    }
}
