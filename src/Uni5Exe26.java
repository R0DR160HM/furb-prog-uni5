import java.util.Scanner;

import javax.xml.validation.Schema;

public class Uni5Exe26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Olá Astolfo, qual é o limite que você desejar pagar de pedágio? R$");
        double limite = scan.nextDouble();

        System.out.println("Agora informe o custo do pedágio (R$) e a distância (km) do primeiro trecho");
        double pedagio = scan.nextDouble();
        double distancia = 0;
        if (pedagio >= 0) {
            distancia = scan.nextDouble();
        }

        int trechosTotais = 0;
        int trechosAcimaDoLimite = 0;
        int trechosDesejaveis = 0;
        
        while (pedagio >= 0) {
            trechosTotais++;
            if (pedagio > limite) {
                trechosAcimaDoLimite++;
            } else if (distancia > 150) {
                trechosDesejaveis++;
            }

            System.out.println("Informe o custo do pedágio (R$) e a distância (km) do próximo trecho");
            pedagio = scan.nextDouble();
            if (pedagio >= 0) {
                distancia = scan.nextDouble();
            }
        }

        scan.close();

        System.out.println(trechosAcimaDoLimite + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(trechosTotais + " (quantidade de trechos informados);");
        System.out.println(trechosDesejaveis + " (trechos acima de 150km com valor aceito por ele).");

    }
}
