import java.util.Scanner;

public class Uni5Exe25 {
    /*
        Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito,
        e E, ponto para o jogador do lado esquerdo da mesa.
        Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. A partida encerra quando:
        ° um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
        ° o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário,
          caso a primeira condição não seja atendida.
    */
    public static void main(String[] args) {
        int d = 0;
        int e = 0;

        String vencedor = "";
        Scanner scan = new Scanner(System.in);

        while (vencedor.equals("")) {
            System.out.print("Quem marcou ponto? E ou D? ");
            char jogador = scan.next().trim().toUpperCase().charAt(0);
            switch (jogador) {
                case 'D': d++;
                          break;
                case 'E': e++;
                          break;
                default:  System.out.println("Jogador inválido");
            }

            if (e >= 21 && e - d >= 2) {
                vencedor = "E";
            } else if (d >= 21 && d - e >= 2) {
                vencedor = "D";
            }
        }

        scan.close();
        System.out.println("O vencedor é " + vencedor + ".");
        System.out.println("E: " + e + "\nD: " + d);


    }
}
