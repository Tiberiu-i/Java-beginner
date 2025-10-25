import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + " " + b + " " + c);

        System.out.println("Este a cel mai mare număr? Răspuns: " + (a > b && a > c));
        System.out.println("Este b cel mai mic număr? Răspuns: " + (b < c && b < a));
        System.out.println("Este suma numerelor a și b mai mică decât c? Răspuns: " + ((a + b) < c));
        System.out.println("Este c mai mare decât media aritmetică dintre a și b? Răspuns: " + (((a + b) / 2) < c));
        System.out.println("Depășește produsul numerelor valoarea 100? Răspuns: " + ((a * b * c) > 100));
        System.out.println("Este suma numerelor a și c divizibilă cu 2? Răspuns: " + ((a + c) % 2 == 0));
        System.out.println("Este a multiplu al numărului b? Răspuns: " + ((a % b) == 0));
        System.out.println("Este b mai mare decât restul împărțirii lui a la c? Răspuns: " + (b > (a % c)));
        System.out.println("Se împarte exact b la diferența numerelor a și c? Răspuns: " + (b % (a - c) == 0));
        System.out.println("Sunt cele 3 numere egale? Răspuns: " + (a == b && b == c));
        System.out.println("Sunt cel puțin două dintre numere egale (oricare două)? Răspuns: "
            + (a == b || a == c || b == c));
    }
}
