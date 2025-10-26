import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pinClient = sc.nextInt();
        int pinCorect = 1234;
        int soldCont = 5000;

        if (pinClient == pinCorect) {
            System.out.println("PIN corect");
            System.out.println("Va rugam sa introduceti suma dorita");
            int suma = sc.nextInt();

            if (suma == 0 || suma < 0) {
                System.out.println("Suma nu poate fi 0 sau mai mica decat 0. La revedere!");
            } else if (suma % 10 != 0) {
                System.out.println("Trebuie sa intoduceti o suma multiplu de 10. La revedere!");
            } else if (suma <= soldCont) {
                System.out.println("Tranzactie in curs de procesare");
                soldCont -= suma;
                System.out.println("Doriti afisarea noii balante a contului curent? Raspundeti cu 0 (NU) sau 1 (DA)");
                int raspuns = sc.nextInt();
                if (raspuns == 1) {
                    System.out.println("Suma ramasa in contul dumneavoastra este: " + soldCont);
                } else if (raspuns == 0) {
                    System.out.println("Multumim pentru ca ati ales Banca DevBank");
                } else {
                    System.out.println("Nu ati introdus 0 sau 1. Ati introdus: " + raspuns + ". La revedere!");
                }
            } else {
                System.out.println("Fonduri insuficiente pentru realizarea tranzactiei");
            }

        } else if (pinClient > 9999 || pinClient < 1000) {
            System.out.println("PIN-ul trebuie sa contina 4 cifre");
        } else {
            System.out.println("PIN gresit");
        }
    }
}
