public class Uni5Exe11 {
    public static void main(String[] args) {
        int biscoitosQuebrados = 0;
        int quebradosPorHora = 0;

        for (int i = 0; i < 16; i++) {
            if (i == 0) {
                quebradosPorHora = 1;
            } else {
                quebradosPorHora *= 3;
            }
            biscoitosQuebrados += quebradosPorHora;
        }
        System.out.println("Nas 16h, " + biscoitosQuebrados + " biscoitos foram quebrados");
    }
}
