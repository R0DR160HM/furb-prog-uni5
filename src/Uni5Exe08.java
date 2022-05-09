import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você informará? ");
        int n = scan.nextInt();

        double menorNegativo = 0;
        double somaPositivos = 0;
        int quantidadePositivos = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o " + i + "° número: ");
            double num = scan.nextDouble();
            if (num < 0) {
                if (num < menorNegativo) menorNegativo = num;
            } else {
                somaPositivos += num;
                quantidadePositivos++;
            }
        }
        scan.close();
        System.out.println("Menor valor negativo: " + menorNegativo + "\nMédia dos positivos: " + somaPositivos / quantidadePositivos);
    }
}
