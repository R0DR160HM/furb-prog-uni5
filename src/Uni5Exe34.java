import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String nome = "";
        int diarias = 0;
        int opcao = 0;
        int contas = 0;
        
        double totalPagar = 0;
        double valorDiarias = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        do {
            System.out.println("(1) Encerrar a conta de um hóspede\n(2) Verificar número de contas encerradas\n(3) Sair.");
            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    contas++;
                    System.out.print("Informe o nome do(a) hóspede: ");
                    nome = scan.next();

                    System.out.print("\nInforme quantos dias ele(a) passou: ");
                    diarias = scan.nextInt();

                    if (diarias < 15) {
                        valorDiarias = 7.5;
                        totalPagar = valorDiarias * diarias;

                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + df.format(totalPagar));

                    } else if (diarias == 15) {

                        valorDiarias = 6.5;
                        totalPagar = valorDiarias * diarias;
                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + df.format(totalPagar));

                    } else {
                        valorDiarias = 5;
                        totalPagar = valorDiarias * diarias;
                        System.out.println("Hóspede: " + nome + "\nValor a pagar: R$" + df.format(totalPagar));
                    }
                    break;

                case 2:
                    System.out.println("Contas encerradas: " + contas);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scan.close();
    }
}
