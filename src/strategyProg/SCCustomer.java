package strategyProg;
public class SCCustomer extends Customer {

	public SCCustomer(String id, String name) {
		super(id, name);
		this.d=new SCDiscount();
		this.typeOfCust="Senior Customer";
		
	}

}
