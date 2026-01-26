package p02_orientacao_objeto.a21_object_e_toString;

import p02_orientacao_objeto.a21_object_e_toString.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class a21_object_e_toString {
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

        //para fazer o print de product da maneira que o programador quer,
        //é necessário sobrescrever o métod toString() na classe Product

        System.out.println("\nProduct data: " + product);

        System.out.println("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        System.out.println("\nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}
