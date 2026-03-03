package Sessao12_Enumeracoes_e_Composicao.a42_enumeracoes.application;

import Sessao12_Enumeracoes_e_Composicao.a42_enumeracoes.entities.Order;
import Sessao12_Enumeracoes_e_Composicao.a42_enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        //converter uma string para um valor do enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("Order Status: " + os1);
        System.out.println("Order Status: " + os2);
    }
}
