import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String message = sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + message);
        }
    }
}
