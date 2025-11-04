import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int previous = sc.nextInt();
        boolean crescator = true;

        for (int i = 2; i <= n; i++) {
            int number = sc.nextInt();
            if (number < previous) {
                crescator = false;
            } else {
                previous = number;
            }
        }
        System.out.println(crescator ? "Sir crescator" : "Nu este sir crescator");
    }
}
