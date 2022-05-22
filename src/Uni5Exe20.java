import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a massa do material (em quilogramas): ");
        double pesoInicial = scan.nextDouble();
        double peso = pesoInicial;
        scan.close();

        int segundos = 0;

        while (peso >= 0.5) {
            segundos += 50;
            peso /= 2;
        }

        System.out.println("Massa inicial: " + pesoInicial + "kg");
        System.out.println("Massa final: " + peso * 1000 + "g");
        System.out.println("Tempo: " + segundos + " segundos");

    }
}
