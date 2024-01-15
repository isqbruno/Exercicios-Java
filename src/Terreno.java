import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Se não tiver certeza de qual localidade está usando, poderá forçar uma localidade específica
        Scanner sc = new Scanner(System.in);
        try{

            System.out.print("\n\nCalculando o valor do terreno\n");

            System.out.print("Largura do terreno: ");
            double largura = sc.nextDouble();

            System.out.print("Comprimeto do terreno: ");
            double comprimento = sc.nextDouble();

            System.out.print("Valor do metro quadrado: ");
            double metroQua = sc.nextDouble();

            double area = largura * comprimento;
            double preco = area * metroQua;

            System.out.print("\nÁrea do terreno: " + String.format("%.1f",area) + "\n");
            System.out.print("Preço do terreno: " + String.format("%.2f",preco) + "\n\n");

        }
        finally{
            sc.close();
        }
    }
}
