package p01_logica;

import java.util.Scanner;

public class a14_operadores_bitwise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int mask = 32;
        int mask = 0b100000;

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if ((n & mask) != 0){
            System.out.println("o 6º bit é verdadeiro.");
        }
        else {
            System.out.println("o 6º bit é falso.");
        }
    }
}
