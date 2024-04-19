import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<double[][]> mxs = new ArrayList<>();

        mxs = DefineMatrixes.define();
        double[][] a = mxs.getFirst();
        double[][] b = mxs.getLast();
        mxs = DefineMatrixes.write(a, b);

        double[][] c;

        System.out.println("Какое действие вы хотите произвести? (+/-/*/CE)");
        String op = sc.nextLine();

        if (op.equals("+")) {
            c = Operations.add(a, b);
            System.out.println(STR."Результат сложения матриц: \n\{c}");
        } else if (op.equals("-")) {
            c = Operations.substract(a, b);
            System.out.println(STR."Результат вычитания матриц: \n\{c}");
        } else if (op.equals("*")) {
            c = Operations.multyply(a, b);
            System.out.println(STR."Результат умножения матриц: \n\{c}");
        } else if (op.equalsIgnoreCase("CE")) {
            if (Operations.checkEquality(a,b)) System.out.println("Матрицы равны!");
            else System.out.println("Матрицы не равны ");
        }
        System.exit(0);
    }
}