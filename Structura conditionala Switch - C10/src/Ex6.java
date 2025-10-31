import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean working = true;

        while (working) {
            char choice = sc.next().charAt(0);
            switch (choice) {
                case 'a':
                case 'A':
                    System.out.println("Aprilie");
                    System.out.println("August");
                    break;
                case 'd':
                case 'D':
                    System.out.println("Decembrie");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Februarie");
                    break;
                case 'i':
                case 'I':
                    System.out.println("Ianuarie");
                    System.out.println("Iunie");
                    System.out.println("Iulie");
                    break;
                case 'm':
                case 'M':
                    System.out.println("Martie");
                    System.out.println("Mai");
                    break;
                case 'n':
                case 'N':
                    System.out.println("Noiembrie");
                    break;
                case 'o':
                case 'O':
                    System.out.println("Octombrie");
                    break;
                case 's':
                case 'S':
                    System.out.println("Septembrie");
                    break;
                case 'x':
                case 'X':
                    working = false;
                    System.out.println("Programul se inchide...");
                    break;
                default:
                    System.out.println("Nicio luna nu incepe cu litera '" + choice + "'.");
                    break;
            }
        }
    }
}
