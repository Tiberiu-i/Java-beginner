import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxSum = 0;
        int number = 0;

        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > maxSum) {
                number = i;
                maxSum = sum;
            }
        }
        if (number != 0) {
            System.out.println(number + " (deoarece are suma divizorilor " + maxSum + ")");
        }
    }
}
