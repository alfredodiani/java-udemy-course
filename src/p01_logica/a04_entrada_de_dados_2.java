package p01_logica;

import java.util.Scanner;

public class a04_entrada_de_dados_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /* Quando utilizamos algum outro comando para ler algo antes do nextLine()
        ao digitar enter a quebra de linha fica guardada como proximo comando na entrada padrão.
        Isso pode causar um problema onde ao utilizar um nextLine() puxamos uma linha vazia para a variável
        exemplo abaixo
         */

        int s4;
        String s5,s6;

        s4 = sc.nextInt();
        s5 = sc.nextLine();
        s6 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        /*
        No caso do exemplo para limpar o buffer e resolver esse problema podemos
        utilizar um nextLine() após a leitura do inteiro
         */
    }
}
