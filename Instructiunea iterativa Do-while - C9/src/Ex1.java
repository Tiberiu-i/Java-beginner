import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numarMagic = sc.nextInt();

        do {
            int numarGhicit = sc.nextInt();
            if (numarGhicit < 0 || numarGhicit > 10) {
                System.out.println("Atentie! Numarul magic se afla in intervalul [0, 10]");
            } else if (numarGhicit > numarMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mic.");
            } else if (numarGhicit < numarMagic) {
                System.out.println("Esti aproape! Dar numarul magic este mai mare.");
            } else {
                System.out.println("Ai ghicit, bravo!");
                break;
            }
        } while (true);
    }
}
