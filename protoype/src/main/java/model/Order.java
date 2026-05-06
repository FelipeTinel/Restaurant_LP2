package model;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    private List<Item> order = new ArrayList<>();
    private double totalPrice = 0;

    public Order () {}
    
    public Order (int id, Customer customer, List<Item> order) {
        
        setId(id);
        setOrder(order);
        setCustomer(customer);
        
    }
    
    private void calculateTotalPrice() {
        totalPrice = 0;
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
        calculateTotalPrice();
        order.add(item);
    }

    public void deleteItem(Item item) {
        calculateTotalPrice();
        order.remove(item);
    }


}
