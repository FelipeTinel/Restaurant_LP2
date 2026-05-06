package model;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    private List<Item> order = new ArrayList<>();
    private double totalPrice = 0;

    Order () {}
    
    Order (int id, Customer customer, List<Item> order) {
        
        setId(id);
        setOrder(order);
        setCustomer(customer);
        
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
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
