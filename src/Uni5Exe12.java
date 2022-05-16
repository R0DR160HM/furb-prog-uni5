import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas linhas deseja no seu triângulo? ");
        int linhas = scan.nextInt();
        scan.close();

        String triangulo = "";
        int ultimoNumero = 0;

        for (int i = 1; i <= linhas; i ++) {
            for (int j = 0; j < i; j++) {
                ultimoNumero++;
                triangulo += (ultimoNumero + " ");
            }
            triangulo += "\n";
        }

        System.out.println(triangulo);

    }
}
