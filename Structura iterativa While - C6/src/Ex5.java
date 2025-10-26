import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int iterator = 0;

        while (iterator <= n) {
            System.out.print(iterator + " ");
            iterator++;
        }

        iterator = 1;
        System.out.println();
        while (iterator <= n) {
            System.out.print(iterator + " ");
            iterator += 2;
        }

        iterator = n - n % 2;
        System.out.println();
        while (iterator >= 0) {
            System.out.print(iterator + " ");
            iterator -= 2;
        }

        iterator = 0;
        System.out.println();
        while (iterator <= n) {
                System.out.print(iterator + " ");
            iterator += 5;
        }
    }
}
