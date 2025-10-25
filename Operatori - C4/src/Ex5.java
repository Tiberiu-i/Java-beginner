import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lungime = sc.nextDouble();
        double latime = sc.nextDouble();
        double inaltime = sc.nextDouble();

        System.out.println(lungime * latime * inaltime);
        System.out.println(lungime * latime);
        System.out.println(2 * (lungime * inaltime + latime * inaltime));
        System.out.println(2 * (lungime * inaltime + latime * inaltime) + 2 * lungime * latime);
    }
}
