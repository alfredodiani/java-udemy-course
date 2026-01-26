package p02_orientacao_objeto.a20_exemplo_product;

import p02_orientacao_objeto.a20_exemplo_product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class a20_exemplo_product {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("en", "US"));

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        sc.close();
    }
}
