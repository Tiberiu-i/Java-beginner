import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int previous = sc.nextInt();
        boolean descrescator = true;

        for (int i = 2; i <= n; i++) {
            int number = sc.nextInt();
            if (number > previous) {
                descrescator = false;
            } else {
                previous = number;
            }
        }
        System.out.println(descrescator ? "Sir descrescator" : "Nu este sir descrescator");
    }
}
