public class Ex1_1 {
    public static void main(String[] args) {
        System.out.println(numberOfDigits(10));
    }

    public static int numberOfDigits(int n) {
        int digits = 1;
        while (n > 9) {
            digits++;
            n /= 10;
        }
        return digits;
    }
}
