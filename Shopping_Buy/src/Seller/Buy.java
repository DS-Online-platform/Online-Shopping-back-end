package Seller;


public class Buy {
	private int custId;
    private String itemId;
 
    public Buy(int id) {
        this.custId = id;
    }
 
    public Buy() {
    }
 
    public Buy(int custId, String itemId) {
        this.custId = custId;
        this.itemId = itemId;
        
    }


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + custId;
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
        Buy other = (Buy) obj;
        if (custId != other.custId)
            return false;
        return true;
    }  
}


