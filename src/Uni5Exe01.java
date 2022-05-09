import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe o " + i + "° número: ");
            int num = scan.nextInt();
            System.out.println("O número é " + (num % 2 == 0 ? "par" : "ímpar"));
        }
        scan.close();

    }
}
