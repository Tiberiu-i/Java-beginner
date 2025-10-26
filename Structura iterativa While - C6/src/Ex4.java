import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        int upperLimit = sc.nextInt();
        int dec = sc.nextInt();
        System.out.println("Start counting...");

        while(upperLimit >= 0) {
            System.out.println(message + "\t" + upperLimit);
            upperLimit -= dec;
        }

        System.out.println("End counting...");
    }
}
