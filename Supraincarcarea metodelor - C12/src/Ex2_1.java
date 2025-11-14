public class Ex2_1 {
    public static void main(String[] args) {
        System.out.println(multiplyWithSumI(6, 8));
    }
    public static int multiplyWithSumI(int a, int b) {
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += a;
        }
        return sum;
    }
}
