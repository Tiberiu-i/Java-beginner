import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
