import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an =  sc.nextInt();
        int luna = sc.nextInt();
        int zi = sc.nextInt();

        int an2 =  sc.nextInt();
        int luna2 =  sc.nextInt();
        int zi2 =  sc.nextInt();

        System.out.println((zi2 + luna2 * 30 + an2 * 360) - (zi + luna * 30 + an * 360));
        System.out.println(((zi2 + luna2 * 30 + an2 * 360) - (zi + luna * 30 + an * 360)) / 360);
    }
}