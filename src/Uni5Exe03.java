public class Uni5Exe03 {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            total += (1f / i);
        }
        System.out.println("Total: " + total);
    }
}
