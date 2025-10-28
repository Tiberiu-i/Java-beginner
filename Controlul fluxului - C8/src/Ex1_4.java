import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =  sc.nextInt();
        int symmetrical = 0;

        while (x != 0) {
            symmetrical = symmetrical * 10 + x % 10;
            x /= 10;
        }
        System.out.println(symmetrical);
    }
}
