import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;

    public Store() {
        this.items = new ArrayList<Item>();
    }

    public int indexOf(int code) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void add(Item i) throws Exception {
        if (items.contains(i)) {
            throw new Exception("This item is already exist in the store.");
        }
        items.add(i);
    }

    public boolean remove(int code) {
        int index = indexOf(code);
        if (index != -1) {
            items.remove(index);
            return true;
        }
        return false;
    }

    public ArrayList<Item> sortingItemsByCode(ArrayList<Item> _items) {
        Item temp = null;
        for (int i = 0; i < _items.size()-1; i++) {
            for (int j = i+1; j < _items.size(); j++) {
                if (_items.get(j).getCode() < _items.get(i).getCode()) {
                    temp = _items.get(i);
                    _items.set(i, _items.get(j));
                    _items.set(j, temp);
                }
            }
        }
        return _items;
    }

    public boolean remove(Item i) {
        return items.remove(i);
    }

    public int numberOfItemsInDiscount() {
        int count = 0;
        for (Item i : items) {
            if (i instanceof ItemOnDiscount) {
                count++;
            }
        }
        return count;
    }

    public void save(String path) throws IOException {
        ArrayList<Item> sortedItems = sortingItemsByCode(items);
        FileWriter writer = new FileWriter(path);
        for (Item i : sortedItems) {
            writer.write(i.toString() + "\n");
        }
        writer.close();
    }
}
