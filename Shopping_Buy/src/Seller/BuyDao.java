package Seller;

import java.util.ArrayList;
import java.util.List;



public class BuyDao {
	private static BuyDao instance;
    private static List<Buy> data = new ArrayList<>();
     
    static {
        data.add(new Buy(1001, "1"));
        data.add(new Buy(1002, "2"));     
    }
     
    private BuyDao() {
         
    }
     
    public static BuyDao getInstance() {
        if (instance == null) {
            instance = new BuyDao();
        }
         
        return instance;               
    }
     
    public List<Buy> listAll() {
        return new ArrayList<Buy>(data);
    }
     
    public int add(Buy Item) {
       // int newId = data.size() + 1;
        //Item.setCustId(newId);
        data.add(Item);
         
        return 1;
    }
     
    public Buy get(int id) {
        Buy ItemToFind = new Buy(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            return data.get(index);
        }
        return null;
    }
     
    public boolean delete(int id) {
        Buy ItemToFind = new Buy(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            data.remove(index);
            return true;
        }
         
        return false;
    }
     
    public boolean update(Buy Item) {
        int index = data.indexOf(Item);
        if (index >= 0) {
            data.set(index, Item);
            return true;
        }
        return false;
    }

}
