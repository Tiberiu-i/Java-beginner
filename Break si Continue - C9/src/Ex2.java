import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();
        int counter = 1;

        for (int i = min; i <= max; i++) {
            if (counter > 5) {
                break;
            }
            if (i % 2 == 1) {
                counter++;
                System.out.println(i);
            }
        }
    }
}
