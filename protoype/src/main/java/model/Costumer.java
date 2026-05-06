package model;

public class Costumer{

    private int id;
    private String name, email, cpf;
    private double bonus;

    Costumer () {};

    Costumer (int id, String name, String email, String cpf) {

        setId(id);
        setName(name);
        setEmail(email);
        setCpf(cpf);
        setBonus(0);
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

    public void setBonus(double bonus) {
        this.bonus = bonus;
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

    public String getCpf() {
        return cpf;
    }



}
