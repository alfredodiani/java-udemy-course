package p01_logica;

public class a02_processamento_e_casting {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(y);


        //Area do trapésio
        double b,B,h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) /2.0 * h;
        System.out.println(area);

        //fazendo uma operação com dois valores inteiros o resultado será um numero inteiro
        //caso seja necessário que o resultado seja um double ou float, é necessário fazer o casting
        int n1,n2;
        double resultado;
        n1 = 5;
        n2 = 2;

        resultado = n1/n2;
        System.out.println(resultado);
        //agora com casting
        resultado = (double) n1/n2;
        System.out.println(resultado);

        //outro exemplo de uso de casting, neste caso para não perder informação
        double n3;
        int n4;

        n3 = 5.0;
        n4 = (int) n3;
        System.out.println(n4);

    }
}
