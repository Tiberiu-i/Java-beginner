import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            int sum = 0;
            boolean isFirstNumber379 = false;
            while (number > 0) {
                sum = sum * 10 + number % 10;
                if (number == 3 || number == 7 || number == 9) {
                    isFirstNumber379 = true;
                }
                number /= 10;
            }
            if (isFirstNumber379) {
                continue;
            }
            System.out.println(sum);
        }
    }
}
