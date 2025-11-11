public class Ex2 {
    public static int numberLength(int number) {
        if (number == 0) {
            return 1;
        }
        int length = 0;
        while (number != 0) {
            length++;
            number = number / 10;
        }
        return length;
    }

    public static void main(String[] args) {
        int testNumber = 25;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = 1_879_658;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = 0;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
        testNumber = -120;
        System.out.println("The number " + testNumber + " has "
                + numberLength(testNumber) + " digits");
    }
}
