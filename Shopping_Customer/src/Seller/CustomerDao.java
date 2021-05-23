package Seller;

import java.util.ArrayList;
import java.util.List;



public class CustomerDao {
	private static CustomerDao instance;
    private static List<Customer> data = new ArrayList<>();
     
    static {
    	data.add(new Customer(1001, "buddy", "0778898789", "kandy","address2","address3"));
		data.add(new Customer(1002, "roos", "0778528981", "ampara","address2","address3"));
		data.add(new Customer(1003, "rina", "0778864719", "wattala","address2","address3"));    
    }
     
    private CustomerDao() {
         
    }
     
    public static CustomerDao getInstance() {
        if (instance == null) {
            instance = new CustomerDao();
        }
         
        return instance;               
    }
     
    public List<Customer> listAll() {
        return new ArrayList<Customer>(data);
    }
     
    public int add(Customer Item) {
       
        data.add(Item);
         
        return 1;
    }
     
    public Customer get(int id) {
        Customer ItemToFind = new Customer(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            return data.get(index);
        }
        return null;
    }
     
    public boolean delete(int id) {
        Customer ItemToFind = new Customer(id);
        int index = data.indexOf(ItemToFind);
        if (index >= 0) {
            data.remove(index);
            return true;
        }
         
        return false;
    }
     
    public boolean update(Customer Item) {
        int index = data.indexOf(Item);
        if (index >= 0) {
            data.set(index, Item);
            return true;
        }
        return false;
    }

}
