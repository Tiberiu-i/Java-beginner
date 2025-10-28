import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.print("Cifrele numarului sunt: ");
        while (x > 9) {
            System.out.print(x % 10 + ", ");
            x /= 10;
        }
        System.out.print(x);
    }
}
