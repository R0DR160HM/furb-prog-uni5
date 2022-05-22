import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int reabastecimentos = scan.nextInt();

        System.out.print("Digite o valor do odômetro com o tanque cheio: ");
        int kmInicial = scan.nextInt();

        int kmDiferenca = 0;
        float soma = 0;
        for (int i = 1; i <= reabastecimentos; i++) {
            System.out.print("Digite o valor do odômetro atual: ");
            int odometro = scan.nextInt();
            System.out.print("Digite a quantidade em L de combustível: ");
            float quantidadeCombustivel = scan.nextFloat();

            kmDiferenca = odometro - kmInicial;
            kmInicial = odometro;

            float kmPorLitro = (kmDiferenca / quantidadeCombustivel);
            System.out.println("A quilometragem por litro de combustível na parada " +
                    i + "  é " + kmPorLitro + " Km");

            soma += kmPorLitro;

        }
        System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem é " + (soma / reabastecimentos) + " Km" );
        
            scan.close();
    }
}
