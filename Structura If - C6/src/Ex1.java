import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("Ianuarie");
        }  else if (month == 2) {
            System.out.println("Februarie");
        } else if (month == 3) {
            System.out.println("Martie");
        } else if (month == 4) {
            System.out.println("Aprilie");
        } else if (month == 5) {
            System.out.println("Mai");
        } else if (month == 6) {
            System.out.println("Iunie");
        } else if (month == 7) {
            System.out.println("Iulie");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("Septembrie");
        } else if (month == 10) {
            System.out.println("Octombrie");
        } else if (month == 11) {
            System.out.println("Noiembrie");
        } else if (month == 12) {
            System.out.println("Decembrie");
        }
    }
}
