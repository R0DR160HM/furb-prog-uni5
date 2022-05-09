import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você informará? ");
        int n = scan.nextInt();

        double maiorNumero = Double.MIN_VALUE;
        double menorNumero = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o " + i + "° número: ");
            double num = scan.nextDouble();
            if (num > maiorNumero) {
                maiorNumero = num;
            }
            if (num < menorNumero) {
                menorNumero = num;
            }
        }
        scan.close();
        System.out.println("Menor número: " + menorNumero + "\nMaior número: " + maiorNumero);
    }
}
