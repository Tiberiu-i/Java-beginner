import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = sc.nextInt();
        int min = number;
        int max = number;
        int sum = number;

        for (int i = 2; i <= n; i++) {
            number = sc.nextInt();
            if (number < min)  {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }
        System.out.println("Numarul minim: " + min);
        System.out.println("Numarul maxim: " + max);
        System.out.println("Media aritmetica: " +  (double) sum / n);
    }
}
