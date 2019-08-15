package comparatorConcept;

public class Customer {
	
	private int custId;
	
	private String custName;
	
	private String custCity;

	public Customer(int custId, String custName, String custCity) {
		
		this.custId = custId;
		this.custName = custName;
		this.custCity = custCity;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custCity=" + custCity + "]";
	}
	
	
	
	

}
