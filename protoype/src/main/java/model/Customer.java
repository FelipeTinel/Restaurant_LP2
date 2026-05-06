package model;

public class Customer{

    private int id;
    private String name, email, cpf;
    private double bonus = 0;
    private Payment payment;

    public Customer (int id, String name, String email, String cpf, Payment payment) {

        setId(id);
        setName(name);
        setEmail(email);
        setCpf(cpf);
        setPayment(payment);

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

    private void calculateBonus (double value) {
        bonus = value * 0.1;
    }


    public boolean makePayment (double value) {
        calculateBonus(value);
        return true;
    }

}
