package model;

public class Item {

    private int id;
    private String name;
    private double price;
    private ItemType type;

    public Item (int id, String name, double price, ItemType type) {

        setId(id);
        setName(name);
        setPrice(price);
        setType(type);

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

    public void setType(ItemType type) {
        this.type = type;
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

    public ItemType getType() {
        return type;
    }

}
