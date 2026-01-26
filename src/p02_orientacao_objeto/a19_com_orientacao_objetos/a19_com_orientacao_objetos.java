package p02_orientacao_objeto.a19_com_orientacao_objetos;

import p02_orientacao_objeto.a19_com_orientacao_objetos.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class a19_com_orientacao_objetos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.of("pt", "BR")); // Scanner em pt-BR
        Locale brasil = Locale.of("pt","BR");

        double p, areaX, areaY;

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.area();
        areaY = y.area();

        System.out.printf(brasil,"Triangle X area: %.4f\n", areaX);
        System.out.printf(brasil, "Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY){
            System.out.println("Larger Area: X");
        }
        else{
            System.out.println("Larger Area: Y");
        }



        sc.close();
    }
}
