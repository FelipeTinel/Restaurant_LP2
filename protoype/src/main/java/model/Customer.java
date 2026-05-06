package model;

public class Customer{

    private int id;
    private String name, email, cpf;
    private double bonus = 0;
    private Payment payment;
    private Order order;

    public Customer () {};

    public Customer (int id, String name, String email, String cpf, Payment payment, Order order) {

        setId(id);
        setName(name);
        setEmail(email);
        setCpf(cpf);
        setPayment(payment);
        setOrder(order);

    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBonus() {
        return bonus;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getCpf() {
        return cpf;
    }

    public Order getOrder() {
        return order;
    }

    private void calculateBonus (double value) {
        bonus = value * 0.1;
    }

    public void makeOrder (Item item) {
        order.addItem(item);        
    }

    public void removeOrderItem (Item item) {
        order.deleteItem(item);
    }

    public boolean makePayment (double value) {
        
        double finalPayment = order.getTotalPrice() - bonus;
        
        if (value < finalPayment)
            throw new IllegalArgumentException("Invalid payment");
        

        calculateBonus(value);

        return true;
    }

}
