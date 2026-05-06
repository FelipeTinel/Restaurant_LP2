package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kitchen {

    private Map<Integer, Order> orders = new LinkedHashMap<>();
        
    public Kitchen () {}

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void addOrder (Order order) {
        order.setStatus(Status.WAITING);
        orders.put(order.getId(), order);
    }

    public void updateStatus(Integer id, Status status) {
        Order order = orders.get(id);
        order.setStatus(status);
    }

    public void makingOrder(Integer id) {
        updateStatus(id, Status.PROCESSING);
    }

    public void readyOrder(Integer id) {
       updateStatus(id, Status.READY);
    }

    public void deliveryOrder(Integer id) {
        updateStatus(id, Status.DELIVERED);
        orders.remove(id);
    }

}
