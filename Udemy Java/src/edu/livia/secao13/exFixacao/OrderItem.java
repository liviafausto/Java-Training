package edu.livia.secao13.exFixacao;

public class OrderItem {
    Integer quantity;
    Double price; // O preço do produto é guardado novamente
    // Se o preço do produto mudar, o programa mantém um histórico do valor pelo qual foi vendido na época
    Product product;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString(){
        return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity
                + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}
