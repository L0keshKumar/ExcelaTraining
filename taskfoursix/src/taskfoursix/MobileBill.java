package taskfoursix;

public class MobileBill {
	private String Name;
	private long phoneNumber;
	private String planName;
	private Address address;
	public static final String BRAND="Jio";
	
	
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MobileBill(String name, long phoneNumber, String planName, Address address) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
		this.planName = planName;
		this.address = address;
	}

	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public long claculateBill() {
		long value=0;
		if(planName.equalsIgnoreCase("prepaid")) {
			value=200;
		}
		else if(planName.equalsIgnoreCase("postPaid"))
		{
			value=300;
		}
		return value;
	}
}
