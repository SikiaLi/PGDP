package pgdp.arrays;

import pgdp.PinguLib;

import java.util.Arrays;

import static pgdp.PinguLib.*;

public class ArrayFun {
    public static void print(int[] a) {
        // TODO
        if (a!=null && a.length!=0){
            System.out.print("{");
            int index = 0;
            while (index < a.length - 1) {
                System.out.print(a[index]+", ");
                index++;
            }
            System.out.println(a[index]+"}");
        }else if (a.length==0){
            System.out.println("{}");
        }
    }

    public static void minAndMax(int[] a) {
        // TODO
        if (!(a == null || a.length == 0)) {
            int max = a[0];
            int min = a[0];
            for (int ele : a) {
                if (ele > max){
                    max = ele;
                }
                if (ele < min) {
                    min = ele;
                }
            }
            System.out.println("Minimum = "+ min + ", Maximum = "+max);

        }
    }

    public static int[] invert(int[] a) {
        // TODO
        if (a == null) {
            return null;
        }else if (a.length==0) {
            return new int[0];
        }else {
            int[] invert = new int[a.length];
            int index = invert.length - 1;
            for (int ele : a) {
                invert[index] = ele;
                index--;
            }
            return invert;
        }
    }

    public static int[] intersect(int[] a, int length) {
        // TODO
        if (length<=0){
            return new int[0];
        }
        if (a == null) {
            return null;
        }
        int[] b = new int[length];
        for (int i = 0; i < length; i++) {
            if (i<a.length){
                b[i] = a[i];
            }else {
                b[i] = 0;
            }
        }
        
        return b;
    }

    public static int[] linearize(int[][] a) {
        // TODO
        int length = 0;
        for (int[] block : a) {
            for (int ele : block) {
                length++;
            }
        }
        int[] liefert = new int[length];
        int index = 0;
        for (int[] block : a) {
            for (int ele : block) {
                liefert[index] = ele;
                index++;
            }
        }
        return liefert;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int[] arr1 = new int[5];
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[][] arr3 = new int[][]{{1, 3}, {25}, {7, 4, 6, 9}};

        //print(arr2);
        //minAndMax(new int[] {1, 10, 25, -13, 1000});
        //System.out.println(Arrays.toString(invert(arr2)));
        //System.out.println(Arrays.toString(intersect(arr2,4)));
        //System.out.println(Arrays.toString(intersect(arr2,7)));
        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.toString(linearize(arr3)));
       // System.out.println(Arrays.deepToString(arr3));

        int[] array = {1, 2, 3, 4, 5, 15};

        for (int i = 0; i <= array.length; ++i) {
            int num = array[i];

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
