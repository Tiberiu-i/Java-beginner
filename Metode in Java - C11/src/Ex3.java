import java.util.Scanner;

public class Ex3 {
    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double multiply3(double operand1, double operand2, double operand3) {
        return multiply2(multiply2(operand1, operand2), operand3);
    }

    public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        return multiply2(multiply2(operand1, operand2), multiply2(operand3, operand4));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double operand1 = sc.nextDouble();
        double operand2 = sc.nextDouble();
        double operand3 = sc.nextDouble();
        double operand4 = sc.nextDouble();

        System.out.println(multiply3(operand1, operand2, operand3));
        System.out.println(multiply4(operand1, operand2, operand3, operand4));
    }
}
