import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double total = 0;

        System.out.print("Informe o valor da compra (0 para finalizar): R$");
        double valor = scan.nextDouble();
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        while (valor != 0) {
            total += valor;
            double desconto = total > 500 ? 0.2 : 0.15;
            System.out.println("Subtotal:      R$" + df.format(total));
            System.out.println("Desconto:      R$" + df.format(valor * desconto) + " (" + desconto * 100 + "%)");
            System.out.println("Valor a pagar: R$" + df.format(valor - (valor * desconto)));
            
            System.out.print("\nInforme o valor da compra (0 para finalizar): R$");
            valor = scan.nextDouble();
        }

        scan.close();

    }
}
