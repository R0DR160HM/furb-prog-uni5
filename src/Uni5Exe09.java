import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int n = scan.nextInt();

        int maioresQue20 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Informe o nome do " + i + "° aluno: ");
            String nome = scan.nextLine();
            System.out.print("Informe a idade do " + i + "° aluno: ");
            int idade = scan.nextInt();
            if (idade == 18) System.out.println(nome);
            else if (idade > 20) maioresQue20++;
        }
        scan.close();

        if (maioresQue20 > 0) {
            System.out.println(maioresQue20 + " alunos têm mais de 20 anos");
        }
        
    }
}
