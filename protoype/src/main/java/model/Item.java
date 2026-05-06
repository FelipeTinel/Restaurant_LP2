package model;

public class Item {

    private int id;
    private String name;
    private double price;

    public Item (int id, String name, double price) {

        setId(id);
        setName(name);
        setPrice(price);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Error: Invalid price");
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
