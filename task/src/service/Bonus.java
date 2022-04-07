package service;
import task.employee.*;
public class Bonus {
	public double calculateBonus(Employee obj) {
		return (obj.getSalary())*1.09;
	}
}
