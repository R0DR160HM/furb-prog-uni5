import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {

        // Basicamento o que nós fizemos nos exercícios de if,
        // porém piorado e menos performático
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o valor (inteiro) desejado: R$");
        int valor = scan.nextInt();
        scan.close();
        
        int cedula20 = 0;
        int cedula10 = 0;
        int cedula5 = 0;
        int cedula2 = 0;
        
        while (valor > 1) {
            if (valor >= 20) {
                cedula20++;
                valor -= 20;
            } else if (valor >= 10) {
                cedula10++;
                valor -= 10;
            } else if (valor >= 5) {
                cedula5++;
                valor -= 5;
            } else if (valor >= 2) {
                cedula2++;
                valor -=2;
            }
        }

        if (cedula20 > 0) {
            System.out.println(cedula20 + " notas de R$20,00");
        }
        if (cedula10 > 0) {
            System.out.println(cedula10 + " notas de R$10,00");
        }
        if (cedula5 > 0) {
            System.out.println(cedula5 + " notas de R$5,00");
        }
        if (cedula2 > 0) {
            System.out.println(cedula2 + " notas de R$2,00");
        }
        if (valor > 0) {
            System.out.println(valor + " notas de R$1,00");
        }

    }
}
