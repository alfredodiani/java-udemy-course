package p01_logica;

import java.util.Locale;
import java.util.Scanner;

public class a03_entrada_de_dados {
    public static void main(String[] args) {
        //é necessário criar um Scanner para ler os dados
        Scanner sc = new Scanner(System.in);

        //Lendo uma string
        String name;
        name = sc.next();
        System.out.println("Voce digitou: " + name);

        //Lendo um inteiro - usar sc.nextInt()
        int x ;
        x = sc.nextInt();
        System.out.println(x);

        //Lendo um double
        //usar virgula ou ponto de acordo com a localidade do SO, para mudar utilizar o Locale.setDefault(Locale.US)

//        Locale.setDefault(Locale.US);                               // muda o default para US
//        sc = new Scanner(System.in).useLocale(Locale.US);           // Scanner também em US
        Locale.setDefault(Locale.of("pt", "BR"));          // define pt-BR como padrão
        sc = new Scanner(System.in).useLocale(Locale.of("pt", "BR")); // Scanner em pt-BR
        Locale brasil = Locale.of("pt","BR");

        double y;
        y = sc.nextDouble();
        System.out.printf(brasil,"%.2f\n",y);


        //Lendo um char
        char c;
        c = sc.next().charAt(0);
        System.out.println("Você digitou " + c);


        //Lendo varios dados na mesma linha
        String d1;
        int d2;
        double d3;

        System.out.println("Digite seu nome, idade e sua altura (ex,1,72) - Use espaço para separar os valores:)");

        d1 = sc.next();
        d2 = sc.nextInt();
        d3 = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        //é necessário fechar o Scanner para desalocar memória e processamento
        sc.close();
    }
}
