package model;
import java.util.List;

public class Order {

    private int id;
    private List<Item> order;
    private double totalPrice;

    Order () {}

    Order (int id, List<Item> order, double totalPrice) {

        setId(id);
        setOrder(order);
        setTotalPrice(totalPrice);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrder(List<Item> order) {
        this.order = order;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public List<Item> getOrder() {
        return order;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
