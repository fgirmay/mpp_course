package prob4;

/**
 * Created by fissehaye on 6/29/18.
 */
public class Item {
    String name;
    Item(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
