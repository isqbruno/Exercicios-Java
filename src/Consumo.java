import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nConsumo\n");
            System.out.print("Distância percorrida: ");
            int d = sc.nextInt();
            System.out.print("Combustível gastos: ");
            sc.nextLine();
            double cg = sc.nextDouble();

            double cm = d / cg;

            System.out.print("\nConsumo médio: "+String.format("%.3f", cm)+"\n\n");

        }
        finally{
            sc.close();
        }
    }
}
