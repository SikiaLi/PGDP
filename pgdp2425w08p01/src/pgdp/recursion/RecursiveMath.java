package pgdp.recursion;

public class RecursiveMath {

    public static long binomCoeffIterative(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        if (k > n) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n + 1 - i;
            result /= i;
        }
        return result;
    }

    public static long binomCoeffRecursive(int n, int k) {
        // TODO: Implement binomCoeff recursively.
        if (k == 0 || n == k) {
            return 1;
        }
        if (k > n) {
            return 0;
        }
        return binomCoeffRecursive(n-1, k-1) + binomCoeffRecursive(n-1, k);
    }

    public static long binomCoeffEndRec(int n, int k) {
        // TODO: Implement tail-recursive binomCoeff.
        if (k == 0 || n == k) {
            return 1;
        }
        if (k > n) {
            return 0;
        }
        return binomCoeffEndRec(n,k,1,1);
    }

    public static long binomCoeffEndRec(int n, int k, int i, int acc) {
        if (k == 0 || n == k) {
            return acc;
        }
        if (k > n) {
            return 0;
        }

        return binomCoeffEndRec(n-1, k, i+1, acc*(n + 1 - i)/i);
    }



    public static long fibonacciRecursive(int n) {
        // TODO: Implement fibonacci recursively.
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static long fibonacciIterative(int n) {
        if (n <= 0) {
            return 0;
        }
        long last = 1;
        long current = 0;
        long tmp;
        for (int i = 0; i < n; i++) {
            tmp = last + current;
            last = current;
            current = tmp;
        }
        return current;
    }

    public static long fibonacciEndRec(int n) {
        // TODO: Implement tail-recursive fibonacci.
        if (n <= 0) {
            return 0;
        }
        return fibonacciEndRec(n, 1, 0);
    }

    public static long fibonacciEndRec(int n, long last, long current) {
        // TODO: Implement tail-recursive fibonacci.
        if (n <= 0) {
            return current;
        }
        return fibonacciEndRec(n-1, current, last+current);
    }
}
