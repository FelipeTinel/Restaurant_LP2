package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Kitchen {

    private Map<Integer, Order> orders = new LinkedHashMap<>();

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public Order getOrder (Integer id) {
        Order order = orders.get(id);
        return order;
    }

    public void addOrder (Order order) {
        orders.put(order.getId(), order);
        order.setStatus(Status.WAITING);
    }

    public void processingOrder(Integer id) {
        getOrder(id).setStatus(Status.PROCESSING);
    }

    public void readyOrder(Integer id) {
        getOrder(id).setStatus(Status.READY);
    }

    public void deliveredOrder(Integer id) {
        getOrder(id).setStatus(Status.DELIVERED);
        orders.remove(id);
    }

}
