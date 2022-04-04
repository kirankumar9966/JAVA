package super1;

/*public class Savings_Account extends Bank {
	Savings_Account(){
		super();
	}
	double Min_Bal=6000;
	public double getMin_Bal() {
		return super.getMin_Bal();
	}
	public void m1() {
		System.out.println(super.getMin_Bal());
	}
	public static void main(String []args){
		Savings_Account a1=new Savings_Account();
		System.out.println(a1.getMin_Bal());
		a1.m1();
	}
}
	
}*/


public class Savings_Account extends Bank{
	Savings_Account(){
		super();
	}
	double Min_Bal=60000;
	public double getMin_Bal(){
		return super.getMin_Bal();
	}
	public void m1() {
		System.out.println(super.getMin_Bal());
	}
	public static void main(String[] args) {
		Savings_Account a1=new Savings_Account();
		System.out.println(a1.getMin_Bal());
		a1.m1();
	}
}