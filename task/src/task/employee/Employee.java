package task.employee;

public class Employee {
	private String Name;
	private long id;
	private long salary;
	private int bonus;
	public Employee(){
		super();
		this.Name=null;
		this.id=0;
		this.salary=0;
		this.bonus=0;
	}
	public Employee(String name,long id,long salary){
		this.Name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getName() {
		return Name;
	}
	public long getId() {
		return id;
	}
	public long getSalary() {
		return salary;
	}
	public int getBonus() {
		return bonus;
	
}
}
