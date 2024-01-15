import java.util.Scanner;
import java.util.Locale;
public class Medidas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nMedidas\n");

            System.out.print("Medida A: ");
            double a = sc.nextDouble();
            System.out.print("Medida B: ");
            double b = sc.nextDouble();
            System.out.print("Medida C: ");
            double c = sc.nextDouble();

            double quadrado = Math.pow(a, 2);
            double triangulo = b * a / 2;
            double trapezio = ((a + b) * c) / 2;

            System.out.print("\nÁREA DO QUADRADO: "+String.format("%.4f", quadrado)+"\n");
            System.out.print("ÁREA DO TRIÂNGULO: "+String.format("%.4f", triangulo)+"\n");
            System.out.print("ÁREA DO TRAPEZIO: "+String.format("%.4f", trapezio)+"\n");

        }
        finally{
            sc.close();
        }

    }
}
