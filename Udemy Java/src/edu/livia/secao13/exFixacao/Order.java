package edu.livia.secao13.exFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private static final SimpleDateFormat FMT_MOMENT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double sum = 0d;
        for(OrderItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Order moment: ").append(FMT_MOMENT.format(moment)).append("\n");
        stringBuilder.append("Order status: ").append(status).append("\n");
        stringBuilder.append("Client: ").append(client).append("\n");
        stringBuilder.append("Order items\n");
        for(OrderItem item : items){
            stringBuilder.append(item).append("\n");
        }
        stringBuilder.append("Total price: $").append(String.format("%.2f", total())).append("\n");

        return stringBuilder.toString();
    }
}
