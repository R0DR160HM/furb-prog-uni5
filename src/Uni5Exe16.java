import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroHomens = 0;
        double alturaHomens = 0;
        int numeroMulheres = 0;
        double alturaMulheres = 0;

        System.out.print("Qual a sua altura? ");
        double altura = scan.nextDouble();
        while (altura != 0) {
            System.out.print("Seu gênero: (M)asculino ou (F)eminino: ");
            char genero = scan.next().toUpperCase().trim().charAt(0);
           
            switch (genero) {
                case 'M':
                    numeroHomens++;
                    alturaHomens += altura;
                    break;
                case 'F':
                    numeroMulheres++;
                    alturaMulheres += altura;
                    break;
                default: System.out.println("Gênero inválido");
            }

            System.out.print("Qual a sua altura? ");
            altura = scan.nextDouble();
        }

        scan.close();

        DecimalFormat df = new DecimalFormat("0.00");

        if (numeroHomens > 0) {
            System.out.println("Média masculina: " + df.format(alturaHomens / numeroHomens));
        }
        if (numeroMulheres > 1) {
            System.out.println("Média feminina: " + df.format(alturaMulheres / numeroMulheres));
        }

    }

}