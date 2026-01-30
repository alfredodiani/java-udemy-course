package Sessao10_Arrays_Listas_Memoria.a35_listas;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        //remove por comparação
        list.remove("Anna");
        System.out.println(list);

        //remove por índice
        list.remove(1);
        System.out.println(list);

        //remove por predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println(list);

        //retornar o índice de um certo elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        list.add("John");
        list.add("James");
        list.add("Faye");
        list.add("Alexi");
        System.out.println(list);

        // filtrar a lista para manter somente os nomes que começam com J
        // (dessa vez usando o predicado com startsWith)
        List<String> result = list.stream().filter(x -> x.startsWith("J")).toList();

        System.out.println(result);

        //encontrar o primeiro elemento que começa com a letra F
        String name = list.stream().filter(x-> x.startsWith("F")).findFirst().orElse(null);
        System.out.println(name);

        String name2 = list.stream().filter(x-> x.startsWith("T")).findFirst().orElse(null);
        System.out.println(name2);
    }
}
