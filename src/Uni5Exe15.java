import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = scan.nextLine();
        String relatorio = "";
        DecimalFormat df = new DecimalFormat("0.00");

        while (!nome.toLowerCase().equals("fim")) {
            System.out.print("Olá " + nome + ", qual foi sua nota na primeira prova? " );
            double nota1 = scan.nextDouble();
            System.out.print("E na segunda? ");
            double nota2 = scan.nextDouble();

            relatorio += "\n" + nome + ": " + df.format((nota1 + nota2) / 2);

            System.out.print("Qual o seu nome? ");
            nome = scan.next();
        }

        scan.close();
        System.out.println(relatorio);

    }
}
