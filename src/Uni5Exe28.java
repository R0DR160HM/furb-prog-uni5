import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int voto = 0;
        char proxVoto = 'S';

        int nenhum = 0;
        int cpm22 = 0;
        int skank = 0;
        int jotaquest = 0;
        double nenhumPerc = 0;
        double cpm22Perc = 0;
        double skankPerc = 0;
        double jotaquestPerc = 0;
        double totalVotos = 0;
        String maisVotado = "";

        DecimalFormat df = new DecimalFormat("0.00");

        while (proxVoto == 'S') {
            System.out.println("Insira seu voto: " + "\n(1) Nenhum de Nós " + "\n(2) CPM22 " + "\n(3) Skank " + "\n(4) Jota Quest ");
            voto = scan.nextInt();

            totalVotos++;

            switch (voto) {
                case 1:
                        nenhum++;
                        break;
                case 2:
                        cpm22++;
                        break;
                case 3:
                        skank++;
                        break;
                case 4:
                        jotaquest++;
                        break;
                default:
                        System.out.println("Voto inválido");
                        break;
            }

            System.out.print("Deseja inserir mais um voto? (S/N)");
            proxVoto = scan.next().toUpperCase().charAt(0);

        }
        if (nenhum > cpm22 && nenhum > skank && nenhum > jotaquest) {
            maisVotado = "Nenhum de Nós";
        } else if (cpm22 > skank && cpm22 > jotaquest) {
            maisVotado = "CPM22";
        } else if (skank > jotaquest) {
            maisVotado = "Skank";
        } else {
            maisVotado = "Jota Quest";
        }

        nenhumPerc = (nenhum / totalVotos) * 100;
        cpm22Perc = (cpm22 / totalVotos) * 100;
        skankPerc = (skank / totalVotos) * 100;
        jotaquestPerc = (jotaquest / totalVotos) * 100;

        System.out.println("Total de votos: " + "\nNenhum de Nós: " + nenhum + 
        "\nCPM22: " + cpm22 + "\nSkank: " + skank + "\nJota Quest: " + jotaquest);

        System.out.println("Porcentagem de votos: " + "\nNenhum de Nós: " + df.format(nenhumPerc) + "%" + "\nCPM22: "
         + df.format(cpm22Perc) + "%" + "\nSkank: " + df.format(skankPerc) + "%" + "\nJota Quest: " + df.format(jotaquestPerc) + "%");

        System.out.println("Grupo mais votado: " + maisVotado);
        scan.close();
    }
}