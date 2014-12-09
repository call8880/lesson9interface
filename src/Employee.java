
public abstract class Employee {
	//protected variables
	protected String name;
	protected double rate;
	protected double hours;
	protected static double pay;
	
	//static variables
	static double LOW_RATE = 6.75;
	static double HIGH_RATE = 30.50;
	static double LOW_HOURS = 1;
	static double HIGH_HOURS = 60;
	protected static double totalPay = 0;
	
	public void Employee(){
		name = "";
		rate = 0;
		hours = 0;
	}
	public boolean setName(String nm){
		boolean blank	= (nm.equals(""));
		if (blank) return false;
		else {
			name = nm;
			return true;
		}
	}
	public boolean setRate(double rt){
		boolean rateok = (rt >= 6.75 && rt <= 30.50);
		if (rateok){
			rate = rt;
			return true;
		}
		else return false;
	}
	public boolean setHours(double hrs){
		boolean hoursok = (hrs >= 1 && hrs <= 60);
		if (hoursok){
			hours = hrs;
			return true;
		}
		else return false;
	}
	public static double getTotalPay(){
		double total = 0;
		total += pay;
		return total;
	}
	public String getName(){
		return name;
	}
	public abstract double getPay();
	
	//static methods
	public static getNameRules(){
		
		
	}
	public static getRateRules(){
		
	}
	public static getHoursRules(){
		
	}
	public static getTotalRules(){
		
	}
}
