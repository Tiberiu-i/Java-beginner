import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int copyNumber = n;
        int result = 1;

        while (n > 0) {
            result *= 10;
            n /= 10;
        }

        System.out.println(result - copyNumber);
    }
}
