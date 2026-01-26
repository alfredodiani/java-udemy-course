package p01_logica;

import java.util.Locale;

public class a01_saida_de_dados {
    public static void main(String[] args) {
        int y= 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%.4f\n",x);
        //Por padrão o Java utiliza os padrões numericos iguais à lingua padrão do SO
        Locale.setDefault(Locale.US); //Muda para padrão americano (ex: troca virgula por ponto)
        System.out.printf("%.4f\n",x);

        //Concatenando elementos em um mesmo comando de escrita
        System.out.println("O resultado é " + y + " metros");
        System.out.printf("O resultado é %.2f metros\n", x);

        //Concatenar varios elementos no mesmo comando
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, renda);

    }
}
