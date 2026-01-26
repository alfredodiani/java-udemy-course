package p02_orientacao_objeto.a22_membros_estaticos;

/*
Como modificação do exemplo anterior dessa aula (a22a) agora iremos
modificar essa classe e criar uma classe chamada "Calculator" dentro do pacote "util"
 */



import p02_orientacao_objeto.a22_membros_estaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class a22b_membros_estaticos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.of("en", "US"));
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circunference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);


        sc.close();

    }
}
