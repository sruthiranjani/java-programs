public class CountDigits {

    static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {

        int number = 12345;
        System.out.println("Number of digits = " + countDigits(number));
    }
}
