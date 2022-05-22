import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int calendario[][] = new int[5][7];

        System.out.print("Em qual dia da semana começa o mês? (considere domingo = 1 e sábado = 7)");
        int diaSemana = scan.nextInt();
        System.out.print("Quantos dias tem o mes? ");
        int diasMes = scan.nextInt();

        for (int i = 1; i < diaSemana; i++) {
            System.out.print("  ");
        }
        for (int linhas = 0; linhas < 5; linhas++) {
            for (int colunas = 0; colunas < 7; colunas++) {

                if (diaSemana <= diasMes) {
                    if (linhas == 0 && colunas == 0) {
                        calendario[0][diaSemana] = 01;
                        System.out.print(calendario[0][diaSemana] + " ");
                    }
                    System.out.print(diaSemana + " ");
                    diaSemana++;
                }
            }
            System.out.println();
        }

        scan.close();

    }
}
