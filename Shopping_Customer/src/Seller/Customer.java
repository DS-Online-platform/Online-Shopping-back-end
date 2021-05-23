package Seller;


public class Customer {
	private int id;
    private String name;
    private String phNumber;
    private String address1;
    private String address2;
    private String address3;
 
    public Customer(int id) {
        this.id = id;
    }
 
    public Customer() {
    }
 
    
 
       
 
    public Customer(int id, String name, String phNumber, String address1, String address2, String address3) {
		super();
		this.id = id;
		this.name = name;
		this.phNumber = phNumber;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (id != other.id)
            return false;
        return true;
    }  
}


