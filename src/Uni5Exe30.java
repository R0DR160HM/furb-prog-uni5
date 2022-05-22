import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaDentro = 0;
        int somaFora = 0;
        System.out.print("Digite o valor maior (N): ");
        int N = scan.nextInt();
        System.out.print("decrésimo (K): ");
        int K = scan.nextInt();
        System.out.print("tamanho (M): ");
        int M = scan.nextInt();

        while (N - K >= 0) {

            if (N <= M) {
                M -= N;
                somaDentro = somaDentro + N;
            } else {
                somaFora = somaFora + N;
            }
            N = N - K;
        }

        System.out.println("Soma dos de dentro: " + somaDentro);
        System.out.println("Soma dos de fora " + somaFora);

        scan.close();
    }
}