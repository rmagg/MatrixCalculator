import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Operations {
    public static void print(double[][] a) {

        //System.out.println("Ваша матрица:");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%6.2f", a[j][i]);
            }
            System.out.println();
        }
    }

    public static double[][] add(double[][] a, double[][] b) {

        if (a.length == b.length && a[0].length == b[0].length) {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[j][i] += b[j][i];
                }
            }
        } else {
            System.err.println("Некорректные размеры матриц");
            System.exit(0);
        }
        return a;
    }

    public static double[][] substract(double[][] a, double[][] b) {

        if (a.length == b.length && a[0].length == b[0].length) {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[j][i] -= b[j][i];
                }
            }
        } else {
            System.err.println("Некорректные размеры матриц");
            System.exit(0);
        }
        return a;
    }

    public static double[][] multyply(double[][] a, double[][] b) {
        double[][] c = new double[a[0].length][b.length];

        if (a.length != b[0].length) {
            System.err.println("Некорректные размеры матриц");
            System.exit(0);
        } else {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[j][i] = 0;
                    for (int k = 0; k < a.length; k++) {
                        c[i][j] += a[k][j] * b[i][k];
                    }
                }

            }
        }
        return c;
    }

    public static boolean checkEquality(double[][] a, double[][] b) {
        return Arrays.deepEquals(a, b);
    }
}
