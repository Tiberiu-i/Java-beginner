import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 10 == 3 || number % 10 == 7 || number % 10 == 9) {
                continue;
            }
            int sum = 0;
            while (number > 0) {
                sum = sum * 10 + number % 10;
                number /= 10;
            }
            System.out.println(sum);
        }
    }
}
