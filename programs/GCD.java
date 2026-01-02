public class GCDExample {

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 60;

        System.out.println("GCD = " + gcd(num1, num2));
    }
}
