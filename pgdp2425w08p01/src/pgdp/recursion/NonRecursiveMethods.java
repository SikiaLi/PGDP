package pgdp.recursion;

public class NonRecursiveMethods {

    public static long factorial(int n) {
        long factorial = 1L;
        for (long i = n; i > 0; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int sumOfDigits(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        return reverse;
    }
}
