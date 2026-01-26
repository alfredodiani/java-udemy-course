package p02_orientacao_objeto.a19_com_orientacao_objetos.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p, result;

        p = (a + b + b) / 2.0;
        result = Math.sqrt(p * (p - a) * (p - b) * (p- c));

        return result;
    }
}
