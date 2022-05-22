import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        double lucro = 0;
        double pc = 0;
        double pv = 0;
        String nome = "";
        double lucroTotal = 0;
        double pcTotal = 0, pvTotal = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o nome da " + i + "ª mercadoria: ");
            nome = scan.next();

            System.out.print("Qual o valor pago nela? R$");
            pc = scan.nextDouble();

            System.out.print("\nQual o valor da venda? R$");
            pv = scan.nextDouble();

            pcTotal += pc;
            pvTotal += pv;
            lucro = (pv - pc) / pc * 100;

            if (lucro < 10) {
                System.out.println("A mercadoria " + nome + " tem um lucro de: " + df.format(lucro) + "%");

            } else if (lucro >= 10 && lucro <= 20) {
                System.out.println("A mercadoria " + nome + " tem um lucro de: " + df.format(lucro) + "%");
            } else if (lucro > 20) {
                System.out.println("A mercadoria " + nome + " tem um lucro de: " + df.format(lucro) + "%");
            }

        }
        scan.close();

        lucroTotal = ((pvTotal - pcTotal) / pcTotal * 100) / 20;
        System.out.print("\nTotal do valor de compra das mercadorias: R$" + pcTotal);
        System.out.print("\nTotal do valor de venda das mercadorias: R$" + pvTotal);
        System.out.print("\nO lucro total: R$" + df.format(lucroTotal));

    }
}
