package exam;

public class This {
	int a=10;
	void m1() {
		int a=500;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[]args) {
		This a=new This ();
		a.m1();
		
	}
	
}
	

