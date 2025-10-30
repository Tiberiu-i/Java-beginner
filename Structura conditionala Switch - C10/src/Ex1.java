import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.next().charAt(0);

        switch (letter) {
            case 'd':
                System.out.println("delta");
                break;
            case 'e':
                System.out.println("echo");
                break;
            case 'v':
                System.out.println("victor");
                break;
            case 's':
                System.out.println("sierra");
                break;
            default:
                System.out.println("Litera invalida!");
        }
    }
}
