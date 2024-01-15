import java.util.Locale;
import java.util.Scanner;
public class Idades {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US); // Forçar a localização.
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nDados da Primeira Pessoa:\n");
            System.out.print("Nome: ");
            String nome1 = sc.nextLine();
            System.out.print("Idade: ");
            int idade1 = sc.nextInt();

            System.out.print("\n\nDados da Segunda Pessoa:\n");
            System.out.print("Nome: ");
            sc.nextLine(); // Limpeza de buffer do teclado.
            String nome2 = sc.nextLine();
            System.out.print("Idade: ");
            int idade2 = sc.nextInt();

            double media = (idade1 + idade2) / 2;

            System.out.print("\nA idade média de " + nome1 + " e " + nome2 + " é de " + String.format("%.1f", media) + " anos.\n\n");
        }
        finally{
            sc.close();
        }
    }
}
