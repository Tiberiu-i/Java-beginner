import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int iterator = 0;

        while (iterator <= n) {
            System.out.print(iterator + " ");
            iterator++;
        }

        iterator = 0;
        System.out.println();
        while (iterator <= n) {
            if (iterator % 2 == 1) {
                System.out.print(iterator + " ");
            }
            iterator++;
        }

        iterator = n;
        System.out.println();
        while (iterator >= 0) {
            if (iterator % 2 == 0) {
                System.out.print(iterator + " ");
            }
            iterator--;
        }

        iterator = 0;
        System.out.println();
        while (iterator <= n) {
            if (iterator % 5 == 0) {
                System.out.print(iterator + " ");
            }
            iterator++;
        }
    }
}
