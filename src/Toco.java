import java.util.Locale;
import java.util.Scanner;

public class Toco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nTROCO\n\n");
            System.out.print("Preço unitário do produto: ");
            double precoUni = sc.nextDouble();
            System.out.print("Quantidade comprada: ");
            int quant = sc.nextInt();
            System.out.print("Dinheiro recebido: ");
            double dinheiro = sc.nextDouble();

            double somaProduto = precoUni * quant;
            double troco = dinheiro - somaProduto;
            
            if (troco < 0){
                System.out.print("FALTA TROCO\n\n");
            } else{
                System.out.print("TROCO: "+String.format("%.2f", troco)+"\n\n");
            }

        }
        finally{
            sc.close();
        }

    }
}
