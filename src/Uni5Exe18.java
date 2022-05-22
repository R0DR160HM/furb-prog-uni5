import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double canal4 = 0;
        double canal5 = 0;
        double canal9 = 0;
        double canal12 = 0;

        System.out.print("Informe o canal que está assistindo: 4, 5, 9 ou 12 ");
        int canal = scan.nextInt();
        while (canal != 0) {
            System.out.print("Quantas pessoas estão assistindo o canal? ");
            int quantidade = scan.nextInt();

            switch (canal) {
                case 4:  canal4 += quantidade;
                break;
                case 5:  canal5 += quantidade;
                break;
                case 9:  canal9 += quantidade;
                break;
                case 12: canal12 += quantidade;
                break;
                default: System.out.println("Canal inválido");
            }
            System.out.print("Informe o canal que está assistindo: 4, 5, 9 ou 12 ");
            canal = scan.nextInt();
        }

        scan.close();

        double total = canal4 + canal5 + canal9 + canal12;
        canal4 = (canal4 / total) * 100;
        canal5 = (canal5 / total) * 100;
        canal9 = (canal9 / total) * 100;
        canal12 = (canal12 / total) * 100;

        System.out.println(
            "Percentual de audiência dos canais:" +
            "\nCanal 4: " + canal4 + "%" +
            "\nCanal 5: " + canal5 + "%" +
            "\nCanal 9: " + canal9 + "%" +
            "\nCanal 12: " + canal12 + "%"
        );

    }
}
