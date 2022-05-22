import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Deseja digitar os dados de um vendedor: s (SIM) / n (NÃO)? ");
        char continua = scan.next().trim().toLowerCase().charAt(0);
        String relatorio = "";
        
        while (continua != 'n') {
            System.out.print("Qual o nome do vendedor? ");
            String nome = scan.next();
            relatorio += "\nColaborador: " + nome;

            System.out.print("Quantos produtos DIFERENTES " + nome + " vendeu no mês? ");
            int n = scan.nextInt();

            double total = 0;

            int produtoAtual = 1;
            while (produtoAtual <= n) {
                System.out.print("Informe o " + produtoAtual + "° produto vendido: ");
                String produto = scan.next();
                System.out.print("Qual é o valor de " + produto + "? R$");
                double valor = scan.nextDouble();
                System.out.print("Quantas unidades de " + produto + " foram vendidas? ");
                int unidades = scan.nextInt();

                total += valor * unidades;

                produtoAtual++;
            }

            relatorio += "\n Total de vendas: R$" + total;
            relatorio += "\n Salário: R$" + total * 0.3;
            relatorio += "\n";
            
            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
            continua = scan.next().trim().toLowerCase().charAt(0);
        }
        scan.close();
        System.out.println(relatorio);
    }
}
