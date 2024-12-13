package pgdp.arrays;

import java.net.Inet4Address;
import java.util.Arrays;

public class MehrdecimaleArrays {

    public static int[][] matrixMult(int[][] a, int[][] b){
        if (a==null || b == null || a.length == 0 || b.length == 0) {
            return null;
        }else if (a[0].length != b.length) {
            return null;
        }else {
            int[][] mul = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        mul[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return mul;
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = new int[][]{
                {3,6},
                {4,1}
        };
        int[][] matrixB = new int[][]{
                {0,1},
                {1,0}
        };
        int[][] matrixC = new int[][]{
                {3,2},
                {1,4},
                {1,2}
        };
        int[][] matrixD = new int[][]{
                {1,0},
                {0,1}
        };

        System.out.println(Arrays.deepToString(matrixMult(matrixA,matrixB)));
        System.out.println(Arrays.deepToString(matrixMult(matrixC,matrixD)));
        int[][] result = matrixMult(matrixA,matrixA);
        result = matrixMult(result,matrixA);
        System.out.println(Arrays.deepToString(result));
    }
}
