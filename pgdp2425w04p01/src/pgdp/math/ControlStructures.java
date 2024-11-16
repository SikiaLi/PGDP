package pgdp.math;

import static pgdp.PinguLib.*;

public class ControlStructures {
    public static void main(String[] args) {
        //printTriangle(6);
       // printCollatz(11);
        //threeAndSeven();
        //System.out.println(sumOfDigits(-5));
        //System.out.println(reverseNumber(1200));
        //System.out.println(isPalindrome(1_234_554_321));
        //printPyramid(6);
        printPrimesUpTo(5);
    }

    public static void printTriangle(int sideLength) {
        if (sideLength<=0) {
            System.out.println("Eingabe muss größer als 0 sein!" );
        } else {
            while (sideLength>0) {
                for (int i = sideLength; i>0; i--) {
                    System.out.print("*");
                }
                System.out.print('\n');
                sideLength--;
            }
        }
    }

    public static void printCollatz(int n) {
        if (n <= 0) {
            System.out.println("Eingabe muss größer als 0 sein!");
        } else {
            int length = 1;
            System.out.print(n);
            while (n>1) {
                if ( n%2 == 0) {
                    n = n/2;
                    System.out.print(" "+ n);
                } else {
                    n = 3*n + 1;
                    System.out.print(" "+ n);
                }
                length++;
            }
            System.out.print("\n");
            System.out.println("Länge: " + length);
        }
    }

    public static void threeAndSeven() {

        int n = readInt("Bitte Zahl eingeben:");
        while (n < 0) {
            System.out.println("Eingabe muss größer oder gleich 0 sein!");
            n = readInt("Bitte Zahl eingeben:");
        }
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            if (i % 3 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 0) {
            return -1;
        } else {
            int quersum = 0;
            while (n > 0) {
                quersum += n % 10;
                n = n/10;
                // 123 3 & 12   2 & 1
            }
            return quersum;
        }
    }


    public static int reverseNumber(int n) {
        int inver = 0;
        while (n>0){
            inver = inver*10; // 0 * 10 = 0 30 320
            inver += n % 10; // 123 3  3 12 % 10 2 32 321
            n = n/10; // 12 1 0
        }
        return inver;
    }

    public static boolean isPalindrome(int n) {
        if (n == reverseNumber(n)){
            return true;
        } else {
            return false;
        }
    }


    public static void printPyramid(int height) {
        if (height<=0) {
            System.out.println("Eingabe muss größer als 0 sein!" );
        } else {
            int h = 1;
            while (height > 0) {
                for (int i = height-1; i > 0; i--){
                    System.out.print(" ");
                }
                for (int i = h-1; i > 0; i--){
                    System.out.print("*");
                }
                System.out.print("*");
                for (int i = h-1; i > 0; i--){
                    System.out.print("*");
                }
                System.out.print('\n');
                h++;
                height--;
            }
        }
    }

    public static void printPrimesUpTo(int n) {
        if (n<=0) {
            System.out.println("Eingabe muss größer als 0 sein!" );
        } else {
            int number = 2;
            while (n>1){
                boolean isPrime = true;
                for (int i = 2; i <= number/2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(number + " ");
                }
                n--;
                number++;
            }
        }
    }

}
