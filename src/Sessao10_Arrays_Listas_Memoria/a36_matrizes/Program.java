package Sessao10_Arrays_Listas_Memoria.a36_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int actualNumber = sc.nextInt();
                mat[i][j] = actualNumber;
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < n ; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int negativesQuantity = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    negativesQuantity++;
                }
            }
        }

        System.out.println("\nNegatives: " + negativesQuantity);

        sc.close();
    }
}
