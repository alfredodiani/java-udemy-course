package Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities;

import Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Client client, LocalDateTime moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public Double total(){
        Double sum = 0.0;

        for (OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        String orderToString =
                "ORDER SUMARY: \n" +
                "Order moment: " + this.moment + "\n" +
                "Client: " + client.getName() + " " +client.getEmail() + "\n" +
                "Order items: \n";
        for (OrderItem orderItem : this.items){
            orderToString += orderItem.toString() + "\n";
        }
        orderToString += "Total price: $" + String.format("%.2f", total()) + "\n";

        return orderToString;
    }
}
