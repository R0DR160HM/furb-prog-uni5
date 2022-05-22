import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;

        double nulo = 0;
        double branco = 0;

        int voto = 0;

        do {
            System.out.println(
                "Digite seu voto:" +
                "\n1, 2, 3, 4 - para candidato" +
                "\n5 - nulo" +
                "\n6 - branco" +
                "\n0 - sair"
            );
            voto = scan.nextInt();

            switch (voto) {
                case 1: candidato1++;
                        break;
                case 2: candidato2++;
                        break;
                case 3: candidato3++;
                        break;
                case 4: candidato4++;
                        break;
                case 5: nulo++;
                        break;
                case 6: branco++;
                        break;
                case 0:
                        break;
                default: System.out.println("Opção incorreta");
            }

        } while (voto != 0);

        scan.close();

        double total = candidato1 + candidato2 + candidato3 + candidato4 + branco + nulo;
        System.out.println("Candidato 1: " + candidato1);
        System.out.println("Candidato 2: " + candidato2);
        System.out.println("Candidato 3: " + candidato3);
        System.out.println("Candidato 4: " + candidato4);
        System.out.println("Nulos: " + nulo);
        System.out.println("Branco: " + branco);
        System.out.println("Nulos são " + ((nulo * 100) / total) + "% do total");
        System.out.println("Brancos são " + ((branco * 100) / total) + "% do total");

    }
    
}
