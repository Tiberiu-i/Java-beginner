import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int counter = 1;

        while (number > 0) {
            if (number < 100 && counter == 1) {
                System.out.println("Numarul introdus trebuie sa contina cel putin 3 cifre");
                break;
            }
            if (counter > 3) {
                break;
            }
            System.out.print(number % 10 + " ");
            number /= 10;
            counter++;
        }
    }
}
