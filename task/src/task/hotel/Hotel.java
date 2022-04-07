package task.hotel;

public class Hotel {
	public String Name;
	public String mailId;
	public double rating;
	//private int 
	public Hotel(){
		super();
		this.Name="Muniyandi Vilas";
		this.mailId="muniyandivilas@gmail.com";
		this.rating=0;
	}
	public Hotel(double rating){
		this();
		this.rating=rating;
	}
	public String getName() {
		return Name;
	}
	public String getMailId() {
		return mailId;
	}
	public double getRating() {
		return rating;
}
}
