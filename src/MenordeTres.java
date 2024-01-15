import java.util.Locale;
import java.util.Scanner;

public class MenordeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("\n\nMenor de Três\n\n");
            System.out.print("1º Valor: ");
            int valor1 = sc.nextInt();
            System.out.print("2º Valor: ");
            int valor2 = sc.nextInt();
            System.out.print("3º Valor: ");
            int valor3 = sc.nextInt();

            // MENOR NÚMERO
            int menor;
            if (valor2 < valor1 && valor2 < valor3) {
                menor = valor2;
            } else if (valor3 < valor1) {
                menor = valor3;
            } else {
                menor = valor1;
            }
            System.out.print("\nMenor número é: " + menor);

            // MAIOR NÚMERO
            int maior;
            if (valor2 > valor1 && valor2 > valor3) {
                maior = valor2;
            } else if (valor3 > valor1) {
                maior = valor3;
            } else {
                maior = valor1;
            }
            System.out.print("\nMaior número é: " + maior + "\n\n");
        }
        finally{
            sc.close();
        }  
    }
}
