package pgdp.recursion;

import java.math.BigInteger;
import java.util.Map;

public class PinguRecursion {

    public static String penguPassword(int age, int birthYear, String name) {
        //TODO 5: Use the methods below to find the password.
        return null;
    }

    public static BigInteger factorialRecursive(int n) {
        //TODO 1: Implement n! recursively.
        return BigInteger.ZERO;
    }

    public static int sumOfDigitsRec(BigInteger n) {
        //TODO 2: Implement the sum of digits from n recursively.
        return 0;
    }

    public static String reverseStringRec(String s) {
        //TODO 3: Reverse the given string recursively.
        return null;
    }


    public static int findGCDRec(int n, int k) {
        //TODO 4: Find the gcd of n & k recursively.
        return 0;
    }


    public static double weightOnPengu(int row, int col, double[][] weights) {
        //TODO: Implement the method recursively to calculate the weight on each penguin at the pyramide.
        return 0.0;
    }


    public static void main(String[] args) {
        System.out.println("==========penguPasswort()==========" + "\n");
        // Testfall 1
        System.out.println("Test 1: Penguin aged 28, born in 1996, named 'Leo'");
        int age1 = 28;
        int birthYear1 = 1996;
        String name1 = "Leo";
        String password1 = penguPassword(age1, birthYear1, name1);
        System.out.println("Berechnetes Passwort: " + password1 + "\n");

        //Testfall 2
        System.out.println("Test 2: Pinguin mit Alter 30, Geburtsjahr 1990 und Name 'Johanna'");
        int age2 = 30;
        int birthYear2 = 1990;
        String name2 = "Johanna";
        String password2 = penguPassword(age2, birthYear2, name2);
        System.out.println("Berechnetes Passwort: " + password2 + "\n");

        System.out.println("==========weightOnPengu()==========");

        double[][] ownWeights = {
                {45.12},                      // Row 0
                {50.85, 120.67},              // Row 1
                {63.29, 140.12, 128.30},      // Row 2
                {70.45, 145.50, 135.75, 112.40}, // Row 3
                {48.20, 137.85, 129.50, 120.70, 115.55} // Row 4
        };

        //Calculated beforehand to compare.
        double[][] weightOnPenguins = {
                {45.12},                          // Row 0
                {73.41, 143.23},                  // Row 1
                {100.00, 248.45, 199.92},         // Row 2
                {120.45, 319.72, 359.93, 212.36}, // Row 3
                {108.43, 357.94, 469.33, 406.85, 221.73} // Row 4
        };

        //This should be 248.45.
        System.out.println("Weight on penguin at (2, 1): " + weightOnPengu(2, 1, ownWeights));

    }
}
