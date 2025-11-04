import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int right = sc.nextInt();

        for (int i = left; i <= right; i++) {
            int number = i;
            int reverse = 0;
            while (number > 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            if (i == reverse) {
                System.out.print(i + " ");
            }
        }
    }
}
