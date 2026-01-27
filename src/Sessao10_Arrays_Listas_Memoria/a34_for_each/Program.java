package Sessao10_Arrays_Listas_Memoria.a34_for_each;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        //for com i
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        //foreach
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
