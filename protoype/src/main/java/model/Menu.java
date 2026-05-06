package model;
import java.util.List;
import java.util.ArrayList;

public class Menu {

    private List<Item> menu;

    Menu () {

     menu = new ArrayList<>();

    }

    public void setMenu(List<Item> menu) {
        this.menu = menu;
    }

    public List<Item> getMenu() {
        return menu;
    }

    public void addItem (Item item) {
        menu.add(item);
    }

    public void removeItem (Item item) {
        menu.remove(item);
    }

}
