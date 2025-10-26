import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar natural pozitiv:");
        int number = sc.nextInt();

        while (number >= 0) {
            System.out.println("Dublul sau este: " + (number * 2));
            System.out.println("Introduceti un numar natural pozitiv:");
            number = sc.nextInt();
        }
        System.out.println("La revedere!");
    }
}
