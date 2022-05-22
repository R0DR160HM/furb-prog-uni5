import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pagamento = 0;
        int novofuncionario = 0;
        int producaoMaior = Integer.MIN_VALUE;
        int producaoMaiorPorTurno = Integer.MIN_VALUE; 
        int producao = 0;
        int diaMaisProdutivo = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        while (novofuncionario != 2) {

            System.out.print("Dia do mês: ");
            int dia = scan.nextInt();

            while (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                System.out.print("Dia do mês: ");
                dia = scan.nextInt();
            }

            System.out.print("Número de peças produzidas no período matutino(manhã): ");
            int pecasmanha = scan.nextInt();

            System.out.print("Número de peças produzidas no período verspertino(tarde): ");
            int pecastarde = scan.nextInt();

            producao = pecasmanha + pecastarde;

            if (dia >= 1 && dia <= 15) {
                if (pecasmanha < 30 || pecastarde < 30) {
                    pagamento = (pecasmanha + pecastarde) * 0.5;
                } else if (pecasmanha + pecastarde >= 100) {
                    pagamento = (pecasmanha + pecastarde) * 0.8;
                } else {
                    pagamento = (pecasmanha + pecastarde) * 0.5;
                }
            }
            if (dia > 15 && dia <= 30) {
                pagamento = (pecasmanha * 0.4) + (pecastarde * 0.3);
            }

            if (producao > producaoMaior) {
                producaoMaior = producao;
                diaMaisProdutivo = dia;
            }
            
            if (pecasmanha > pecastarde && pecasmanha > producaoMaiorPorTurno) {
                producaoMaiorPorTurno = pecasmanha;
                System.out.println("Produziu mais no período matutino: " + producaoMaiorPorTurno + " peças");
            } else {
                producaoMaiorPorTurno = pecastarde;
                System.out.println("Produziu mais no período vespertino: " + producaoMaiorPorTurno + " peças");
            }

            System.out.println("Valor recebido: R$" + df.format(pagamento));

            System.out.print("Novo funcionário? \n(1) Sim\n(2) Não ");
            novofuncionario = scan.nextInt();
        }
        System.out.println("Dia " + diaMaisProdutivo + " foi o mais produtivo");
        scan.close();
    }
}