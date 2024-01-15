import java.util.Locale;
import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n\nBaskara\n");
            System.out.print("Coeficiente a: ");
            double a = sc.nextDouble();
            System.out.print("Coeficiente b: ");
            double b = sc.nextDouble();
            System.out.print("Coeficiente c: ");
            double c = sc.nextDouble();

            // 1º encontrar o valor de delta.
            double delta = Math.pow(b, 2) - (4 * a * c);
            
            // 2º Encontrar valores das rizes
            if (delta > 0) { // Dusas raizes reais e distintas

                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.print("\nDuas raízes: \nx1 = " + String.format("%.4f", raiz1) + "\nx2 = " + String.format("%.4f", raiz2) + "\n\n");

            } else if (delta == 0) { //Duas raízes reais e iguais

                double raiz = -b / (2 * a);
                System.out.print("\nDuas raízes iguais: \nx1 = " + String.format("%.4f", raiz) + "\nx2 = " + String.format("%.4f", raiz) + "\n\n");

            } else { //Duas raizes complexas

                double parteReal = -b / (2 * a);
                double parteImaginaria = Math.sqrt(-delta) / (2 * a);
                System.out.print("\nDuas raízes complexas: \nx1 = " + String.format("%.4f + %.4fi", parteReal, parteImaginaria) + "\nx2 = " + String.format("%.4f - %.4fi", parteReal, parteImaginaria) + "\n\n");

            }
        }
        finally {
            sc.close();
        }
    }
}