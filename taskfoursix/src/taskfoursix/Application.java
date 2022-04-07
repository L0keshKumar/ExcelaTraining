package taskfoursix;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("16/2", "East Mada", "Villivakkam", "600049");
		MobileBill billOne=new MobileBill("loki", 9856375, "postpaid",address);
		System.out.println(MobileBill.BRAND);
		System.out.println("billOne Amount:-"+billOne.claculateBill());
		System.out.println("ADDRESS:--"+billOne.getAddress());
		//System.out.println("BILL DETAILS:----");
	}

}
