package p02_orientacao_objeto.a18_sem_orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

public class a18_sem_orientacao_objetos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.of("pt", "BR")); // Scanner em pt-BR
        Locale brasil = Locale.of("pt","BR");

        double xA, xB, xC, yA, yB, yC, p, areaX, areaY;

        System.out.println("Enter the measures of triangle X");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2.0;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p- xC));

        p = (yA + yB + yC) / 2.0;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p- yC));

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
