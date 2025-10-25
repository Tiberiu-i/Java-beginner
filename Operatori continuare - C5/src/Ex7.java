import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ore =  sc.nextInt();
        ore *= 3600;
        int minute = sc.nextInt();
        minute *= 60;
        int secunde = sc.nextInt();

        int totalSecunde = ore + minute + secunde;

        System.out.println("Numarul de secunde de la miezul noptii pana la ora " + ore / 3600 + ":" + minute / 60 +
                ":" + secunde + " este de " + totalSecunde + " secunde");
    }
}
