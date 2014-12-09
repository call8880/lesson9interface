
public class PartTimeEmployee extends Employee{
	
	public PartTimeEmployee(){
		super();
	}
	
	public double getPay(){
		pay = rate * hours;
		totalPay += pay;
		return pay;
	}
	
}
