package Sessao10_Arrays_Listas_Memoria.a31_vetores_pt1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] myVect = new double[n];

        for (int i = 0; i < n; i++) {
            myVect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i <n; i++) {
            sum += myVect[i];
        }

        double avg = sum /n;

        System.out.printf("Average Height: %.2f\n", avg);


        sc.close();
    }
}
