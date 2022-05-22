import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numero a ser transformado em números primos: ");
        int numero = scan.nextInt();
        int fator = 2;

        while (numero > 1) {
            while (numero % fator == 0) {
                numero /= fator;
                System.out.println("fator: " + fator);
            }
            fator++;
        }

        scan.close();
    }

}
