package p02_orientacao_objeto.a22_membros_estaticos.util;

/*
Classe não estática, precisa instanciar um objeto para
poder utilizar as funções e atributos
 */
public class Calculator {

    public final double PI = 3.14159;

    public double circunference(double radius){
        return 2.0 * PI * radius;
    }

    public double  volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
