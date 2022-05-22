import java.text.DecimalFormat;
import java.util.Calendar;

public class Uni5Exe22 {
    public static void main(String[] args) {
        
        double salario = 2000; // 1995
        double aumento = salario * 0.015;
        int ano = 1996;
        salario += salario = aumento;

        while (Calendar.getInstance().get(Calendar.YEAR) > ano) {
            ano++;
            aumento *= 2;
            salario += aumento;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Salário atual: R$" + df.format(salario));

    }
}
