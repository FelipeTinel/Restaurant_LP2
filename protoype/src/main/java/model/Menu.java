package model;

import java.util.Map;
import java.util.LinkedHashMap;

public class Menu {

    private Map<Integer, Item> menu = new LinkedHashMap<>();

    public void setMenu(Map<Integer, Item> menu) {
        this.menu = menu;
    }

    public Map<Integer, Item> getMenu() {
        return menu;
    }

    public void addItem (Integer id, Item item) {
        menu.put(id, item);
    }

    public void removeItem (Integer id) {
        menu.remove(id);
    }

    public void getItem (Integer id) {
        menu.get(id);
    }

}
