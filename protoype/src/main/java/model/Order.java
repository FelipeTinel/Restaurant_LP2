package model;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private List<Item> order = new ArrayList<>();
    private double totalPrice = 0;

    Order () {}
    
    Order (int id, List<Item> order, double totalPrice) {
        
        setId(id);
        setOrder(order);
        
    }
    
    private void calculateTotalPrice() {
        for (Item item : order) {
            totalPrice += item.getPrice();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrder(List<Item> order) {
        calculateTotalPrice();
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

    public void addItem(Item item) {
        order.add(item);
        calculateTotalPrice();
    }

    public void deleteItem(Item item) {
        order.remove(item);
        calculateTotalPrice();
    }


}
