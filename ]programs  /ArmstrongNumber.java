public class ArmstrongNumber {

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

        // Count number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate sum of powers
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        int number = 153;

        if (isArmstrong(number))
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
