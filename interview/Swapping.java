package interview;

public class Swapping {

//	public static void main(String[] args) {
//		int a=10;int b=20;
//		System.out.println("before swapping values are..."+a+" "+b);
//		a=a+b;//10+20=30
//		b=a-b;//=10
//		a=a-b;//10
//		System.out.println("after swapping values are..."+a+" "+b);
//
//	}
	public static void main(String[] args) {
		int a=10;int b=20; 
		System.out.println("before swapping values are..."+a+" "+b);
		int t=a;
			a=b;
			b=t;
		
		System.out.println("after swapping values are..."+a+" "+b);

	}

}
