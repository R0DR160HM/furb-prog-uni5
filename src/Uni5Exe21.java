public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double alturaChico = 1.5;
        double crescimentoChico = 0.02;
        double alturaZe = 1.1;
        double crescimentoZe = 0.03;
        
        int anos = 0;

        while (alturaZe < alturaChico) {
            anos++;
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
        }

        System.out.println("Zé precisará de " + anos + " anos para ser maior que Chico");

    }
}
