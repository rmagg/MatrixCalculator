import java.util.ArrayList;
import java.util.Scanner;

public class DefineMatrixes {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<double[][]> define() {

        ArrayList<double[][]> matrixes = new ArrayList<>();

        System.out.println("Введите количество столбцов и строк первой матрицы: ");
        int aColumns = sc.nextInt(); // 2
        int aLines = sc.nextInt(); // 3
        double[][] a = new double[aColumns][aLines]; // 2 * 3

        System.out.println("Введите количество столбцов и строк второй матрицы: ");
        int bColumns = sc.nextInt(); // 3
        int bLines = sc.nextInt(); // 2
        double[][] b = new double[bColumns][bLines]; // 3 * 2

        matrixes.add(a);
        matrixes.add(b);

        return matrixes;
    }


    public static ArrayList<double[][]> write(double[][] a, double[][] b) {

        ArrayList<double[][]> matrixes = new ArrayList<>();

        System.out.println("Вводите по порядку элементы матрицы A.");
        for (int i = 0; i < a[0].length; i++) {              // до 3
            System.out.println("Строка " + (i + 1) + ":");
            for (int j = 0; j < a.length; j++) {             // до 2
                a[j][i] = sc.nextDouble();                   // 2 * 3
            }
        }

        System.out.println("Вводите по порядку элементы матрицы B.");
        for (int i = 0; i < b[0].length; i++) {              // до 2
            System.out.println("Строка " + (i + 1) + ":");
            for (int j = 0; j < b.length; j++) {             // до 3
                b[j][i] = sc.nextDouble();                   // 3 * 2
            }
        }
        matrixes.add(a);
        matrixes.add(b);

        return matrixes;
    }

}
