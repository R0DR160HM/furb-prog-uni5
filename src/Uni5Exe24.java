import java.util.Scanner;

public class Uni5Exe24 {
    /**
        Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia.
        Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas)
        de cada peixe e escreva o peso total da pesca obtido até aquele ponto.
        Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo.
        Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar
        a seguinte mensagem: “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é o limite de hoje (em quilogramas)? ");
        double limite = scan.nextDouble();

        double peixes = 0;

        char continua = 's';
        while (continua == 's') {
            System.out.print("Informe o peso do peixe (em quilogramas): ");
            double peixe = scan.nextDouble();

            if (peixes + peixe > limite) {
                System.out.println("A sua pescaria excedeu o limite diário");
                continua = 'n';
            } else {
                peixes += peixe;
                System.out.println("Peso total atual: " + peixes + "kg");

                System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                continua = scan.next().trim().toLowerCase().charAt(0);
            }
        }
        scan.close();
        System.out.println("Peso final: " + peixes + " / " + limite + "kg");
        
    }
}
