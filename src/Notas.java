import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\n\nNotas\n");
            System.out.print("Digite a primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = sc.nextDouble();

            double notaT = nota1 + nota2;

            if( notaT < 60.00) {
                System.out.print("\n\nREPROVADO!!!\n\n");
            } else {
                System.out.print("\n\nAPROVADO!!!\n\n");
            }
        }
        finally {
            sc.close();
        }
    }
}