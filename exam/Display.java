package exam;

public class Display {
	public void m1 () {
		System.out.println("only one argment");
	}
	public void m1(int a) {
		System.out.println("only two argment");
	}
	public void m1(int a,int b) {
		System.out.println("only three argment");
		
	}

	public static void main(String[] args) {
		Display d =new Display();
		d.m1();
		d.m1(10);
		d.m1(10,230);
		
	}

}
