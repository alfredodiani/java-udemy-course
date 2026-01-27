package Sessao10_Arrays_Listas_Memoria.a33_boxing_wrapper.application;

public class Program {
    public static void main(String[] args) {

        //Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        //Unboxing
        int y = (int) obj;
        System.out.println(y);

        //Wrapper classes
        //Wrapper classes aceita null como valor e converte automaticamente sem utilizar casting
        Integer a = 20;
        int b = a;
        int c = a * 2;

        System.out.printf("A = %d\nB = %d\nC = %d",a,b,c);


    }
}
