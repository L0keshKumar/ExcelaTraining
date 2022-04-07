package task.customer;

public class Customer {
	private String Name;
	private long phoneNumber;
	private boolean payment;
	private int tips;
	private static long custCount;
	public Customer(){
		super();
		this.Name=null;
		this.payment=false;
		this.phoneNumber=0;
		this.tips=0;
	}
	public Customer(String name,long phNum,boolean amount,int tips){
		this.Name=name;
		this.payment=amount;
		this.phoneNumber=phNum;
		this.tips=tips;
		++custCount;
	}
	public String getName() {
		return Name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public boolean isPayment() {
		return payment;
	}
	public int getTips() {
		return tips;
	}
	public long getCustomerCount() {
		return custCount;
	
	}
}
