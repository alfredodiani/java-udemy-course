package Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.application;

import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.Client;
import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.Order;
import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.OrderItem;
import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.Product;
import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.enums.OrderStatus;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:\nName:");
        String name = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth date (dd/mm/yyyy): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), dateFormater);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");

        System.out.println("Enter order status:\n[0]Pending Payment\n[1]Processing\n[2]Shipped\n[3]Delivered");
        int status_code = sc.nextInt();

        Order order = new Order(client, LocalDateTime.now(), OrderStatus.fromCode(status_code));

        System.out.print("How many items in this order? ");
        int order_item_quantity = sc.nextInt();

        for (int i = 1; i <= order_item_quantity; i++) {
            System.out.println("Enter #" + i + " item data:\nProduct name: ");
            String product_name = sc.next();
            System.out.println("Product price: ");
            Double product_price = sc.nextDouble();
            System.out.println("Product quantity: ");
            Integer product_quantity = sc.nextInt();

            Product new_product = new Product(product_name,product_price);
            OrderItem orderItem = new OrderItem(new_product, product_quantity, product_price);

            order.addItem(orderItem);

        }

        System.out.println(order);

        System.out.println();







    }
}
