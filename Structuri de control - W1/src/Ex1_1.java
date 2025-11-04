import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int e = sc.nextInt();

        int result = 1;
        System.out.print(result + " ");

        for (int i = 1; i <= e; i++) {
            result *= b;
            System.out.print(result + " ");
        }
    }
}
