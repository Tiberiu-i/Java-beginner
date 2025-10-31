import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean working = true;
        int sold = 1000;

        System.out.println("===== Bine ati venit =====");
        System.out.println("Optiuni disponibile:\n\t1. Interogare Sold\n\t2. Retragere Numerar\n\t3. Depunere\n\t" +
                "4. Curs Valutar\n\t5. Info\n\t6. Iesire");
        System.out.println();

        while (working) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Soldul dumneavoastra este " + sold + " RON.");
                    System.out.println();
                    break;
                case 2:
                    int suma = sc.nextInt();
                    if (suma <= sold) {
                        if (suma % 10 == 0 && suma >= 10) {
                            sold -= suma;
                            System.out.println("Operatie efectuata cu succes!");
                            System.out.println();
                        } else {
                            System.out.println("Valoare invalida!");
                            System.out.println();
                        }
                    } else {
                        System.out.println("Valoare invalida!");
                        System.out.println();
                    }
                    break;
                case 3:
                    int suma2 = sc.nextInt();
                    if (suma2 % 10 == 0 && suma2 >= 10) {
                        sold += suma2;
                        System.out.println("Operatie efectuata cu succes!");
                        System.out.println();
                    } else {
                        System.out.println("Valoare invalida!");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Cursul valutar: 1 EUR = 5 RON");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Numele bancii: DevBank");
                    System.out.println();
                    break;
                case 6:
                    working = false;
                    break;
                default:
                    System.out.println("Optiuni disponibile:\n\t1. Interogare Sold\n\t2. Retragere Numerar\n\t" +
                            "3. Depunere\n\t4. Curs Valutar\n\t5. Info\n\t6. Iesire");
                    System.out.println();
                    break;
            }
        }
    }
}
