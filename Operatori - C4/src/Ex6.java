import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int verzi = sc.nextInt();
        int rosii = sc.nextInt();
        int negre = sc.nextInt();

        System.out.println((double) verzi / (verzi + rosii + negre) * 100);
    }
}
