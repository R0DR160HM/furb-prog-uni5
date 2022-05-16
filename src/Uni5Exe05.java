import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos números você deseja? ");
        int quantidade = scan.nextInt();
        scan.close();

        String relatorio = "";
        int ultimoNumero = 8;

        for (int i = 0; i < quantidade; i++) {
            boolean deveSomar = i % 2 == 0;
            relatorio += ultimoNumero + " ";
            if (deveSomar) {
                ultimoNumero += 2;
            } else {
                ultimoNumero = (ultimoNumero - 2) * 2;
            }
        }
        System.out.println(relatorio);

    }
}
