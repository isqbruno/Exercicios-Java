import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Se não tiver certeza de qual localidade está usando, poderá forçar uma localidade específica
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nCalculando o Retângulo:\n");

            System.out.print("Base do Retângulo: ");
            double base = sc.nextDouble();

            System.out.print("Altura do Retângulo: ");
            double altura = sc.nextDouble();

            double area = base * altura;
            double perimetro = 2 * (altura + base);
            double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

            System.out.print("\nResultado:\nÁrea : " + String.format("%.2f",area) + "\n");
            System.out.print("Perimetro: " + String.format("%.2f",perimetro) + "\n");
            System.out.print("Diagonal: " + String.format("%.2f",diagonal) + "\n\n");

        }
        finally{
            sc.close();
        }
    }
}
