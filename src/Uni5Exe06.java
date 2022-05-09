import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe a altura da " + i + "ª pessoa: ");
            altura += scan.nextDouble();
        }
        scan.close();
        System.out.println("A média das alturas é de " + (altura / 20) + "m");
    }
}
