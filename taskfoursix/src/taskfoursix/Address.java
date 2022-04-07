package taskfoursix;

public class Address {
	private String streetNumber;
	private String streetName;
	private String areaName;
	private String pinNumber;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetNumber, String streetName, String areaName, String pinNumber) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.areaName = areaName;
		this.pinNumber = pinNumber;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	public String toString() {
		return "StreetNumber="+streetNumber+"\nStreetName"+streetNumber+"\nAreaName"+areaName+"\nPinCode"+pinNumber;
		
	}
}
