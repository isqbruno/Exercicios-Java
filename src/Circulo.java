import java.util.Scanner;
import java.util.Locale;
public class Circulo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            /*
                * área ------------------------> a
                * raio ------------------------> r
                * diâmetro --------------------> d
                * diâmetro da circunfêrencia --> dc
             */

            System.out.print("\n\nCircunfêrencia do Círculo\n");
            System.out.print("Digite o valor do ráio do círculo: ");
            double r = sc.nextDouble();

            double a = Math.PI * Math.pow(r, 2);
            double d = Math.pow(r,2);
            double dc = 2 * Math.PI * r;

            System.out.print("\n\nResultados:\nÁREA: "+String.format("%.3f", a)+"\nDIÂMETRO: "+String.format("%.3f", d)+"\nDIÂMETRO DA CIRCUNFÊRENCIA: "+String.format("%.3f", dc)+"\n\n");
        }
        finally{
            sc.close();
        }
    }
}
