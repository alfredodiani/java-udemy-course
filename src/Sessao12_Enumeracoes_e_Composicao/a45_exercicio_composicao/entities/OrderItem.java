package Sessao12_Enumeracoes_e_Composicao.a45_exercicio_composicao.entities;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItem (Product product, Integer quantity, Double price){
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + ", $" +
                String.format("%.2f", product.getPrice()) +
                "Subtotal: $" + String.format("%.2f", subTotal());
    }
}
