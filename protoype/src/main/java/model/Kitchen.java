package model;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {

    private List<Order> orders = new ArrayList<>();
        
    public Kitchen () {}
    
    public Kitchen (Order orders) {

        setOrders(getOrders());

    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }




}
