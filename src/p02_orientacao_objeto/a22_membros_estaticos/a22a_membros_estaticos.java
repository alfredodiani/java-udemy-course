/*

Static => significa que os métodos ou classes não dependem de uma instância de um objeto para existirem,
ou seja, podem ser chamados sem instanciar a classe.

Neste arquivo temos um exemplo sobre Static
com métodos na própria classe do programa
Nota: dentro de um métod estático você não pode chamar membros de instância da mesma classe

 */

package p02_orientacao_objeto.a22_membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class a22a_membros_estaticos {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.of("en","US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circunference(radius);

        double v = volume(radius);

        System.out.printf("Circunference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", PI);


        sc.close();

    }

    public static double circunference(double radius){
        return 2.0 * PI * radius;
    }

    public static double  volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
