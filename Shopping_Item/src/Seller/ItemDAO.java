package Seller;

import java.util.ArrayList;
import java.util.List;



public class ItemDAO {
	private static ItemDAO instance;
    private static List<Item> data = new ArrayList<>();
     
    static {
        data.add(new Item(1, "iPhone X", 999.99f));
        data.add(new Item(2, "XBOX 360", 329.50f));     
    }
     
    private ItemDAO() {
         
    }
     
    public static ItemDAO getInstance() {
        if (instance == null) {
            instance = new ItemDAO();
        }
         
        return instance;               
    }
     
    public List<Item> listAll() {
        return new ArrayList<Item>(data);
    }
     
    public int add(Item Item) {
        int newId = data.size() + 1;
        Item.setId(newId);
        data.add(Item);
         
        return newId;
    }
     
    public Item get(int id) {
        Item ItemToFind = new Item(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            return data.get(index);
        }
        return null;
    }
     
    public boolean delete(int id) {
        Item ItemToFind = new Item(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            data.remove(index);
            return true;
        }
         
        return false;
    }
     
    public boolean update(Item Item) {
        int index = data.indexOf(Item);
        if (index >= 0) {
            data.set(index, Item);
            return true;
        }
        return false;
    }

}
