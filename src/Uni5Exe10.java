public class Uni5Exe10 {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1000; i < Integer.MAX_VALUE; i++) {

            String number = String.valueOf(i);
            int half = number.length() / 2;

            String parte1 = number.substring(0, half);
            String parte2 = number.substring(half);

            int soma = Integer.parseInt(parte1) + Integer.parseInt(parte2);

            if (Math.pow(soma, 2) == i) {
                System.out.println(parte1 + " + " + parte2 + " = " + soma + " -> " + soma + "² = " + i);
                total++;
                if (total == 10) {
                    return;
                }
            }

        }
        
    }
}