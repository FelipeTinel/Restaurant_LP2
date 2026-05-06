package model;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    private List<Item> order = new ArrayList<>();
    private Status status;
    private double totalPrice = 0;

    public Order () {}
    
    public Order (int id, Customer customer, List<Item> order, Status status) {
        
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
        this.order = order;
        calculateTotalPrice();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public Status getStatus() {
        return status;
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
