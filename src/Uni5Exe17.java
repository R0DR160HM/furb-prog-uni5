import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalAtletas = 0;
        double totalAlturas = 0;

        int inscricaoMaisAlto = 0;
        double alturaMaisAlto = Double.MIN_VALUE;

        int inscricaoMaisBaixo = 0;
        double alturaMaisBaixo = Double.MAX_VALUE;

        System.out.print("Informe o número de inscrição do atleta: ");
        int inscricao = scan.nextInt();
        System.out.print("Informe a altura do atleta: ");
        double altura = scan.nextDouble();
        
        while (inscricao != 0) {
            totalAtletas++;
            totalAlturas += altura;
            
            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                inscricaoMaisAlto = inscricao;
            }
            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                inscricaoMaisBaixo = inscricao;
            }

            System.out.print("Informe o número de inscrição do atleta: ");
            inscricao = scan.nextInt();
            if (inscricao != 0) {
                System.out.println("Informe a altura do atleta: ");
                altura = scan.nextDouble();
            }
        }
        scan.close();

        DecimalFormat df = new DecimalFormat("0.00");

        if (totalAtletas > 0) {
            System.out.println("Atleta mais alto:");
            System.out.println("    Inscrição: " + inscricaoMaisAlto);
            System.out.println("    Altura: " + df.format(alturaMaisAlto));
            System.out.println("\nAtleta mais baixo:");
            System.out.println("    Inscrição: " + inscricaoMaisBaixo);
            System.out.println("    Altura: " + df.format(alturaMaisBaixo));
            System.out.println("\n Altura média: " + df.format((totalAlturas / totalAtletas)));
        }

        
    }
}
