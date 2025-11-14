public class Ex0_1 {
    public static void main(String[] args) {
        System.out.println(fatorialI(4));
    }

    public static int fatorialI(int n) {
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
