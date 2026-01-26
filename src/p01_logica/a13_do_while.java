package p01_logica;

import java.util.Locale;
import java.util.Scanner;

public class a13_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double c = sc.nextDouble();
            double f = 9.0 * c /5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheight : %.1f\n", f);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp == 's' );

        sc.close();
    }
}
