import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Numarul " + number + " este numar par.");
        } else {
            System.out.println("Numarul " + number + " este numar impar.");
        }
    }
}
