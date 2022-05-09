public class Uni5Exe04 {
    public static void main(String[] args) {
        double numerador = 3;
        double denominador = 2;

        double soma = numerador / denominador;

        int auxiliar = 2;

        for (int i = 1; i < 20; i++) {
            numerador += 2;
            auxiliar += 2;
            denominador += auxiliar;
            soma += numerador / denominador;
            System.out.println(numerador + " / " + denominador + " = " + soma);
        }

        System.out.println("Soma: " + soma);
    }
}
