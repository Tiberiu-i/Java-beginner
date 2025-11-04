import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.print(i + " ");
            }
        }
        if (isPrime) {
            System.out.println("Este numar prim");
        }
    }
}
