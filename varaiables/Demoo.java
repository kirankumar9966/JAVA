/*class Demo{
	int a=100;
	int b=200;
	static int c=10;
public static void main(String []args){
Demo d1=new Demo();
System.out.println(d1.a+d1.b);
System.out.println(d1.a+d1.b+d1.c);
d1.a=10;
d1.c=100;
System.out.println(d1.a+d1.b+d1.c);
Demo d2=new Demo();
System.out.println(d1.a+d1.b+d1.c);
d1.a=500;
System.out.println(d1.a+d1.b+d1.c);
}
}*/

class Demo{
	static int c=10;

Demo d1=new Demo();
System.out.println(d1.a+d1.b);
System.out.println(d1.a+d1.b+d1.c);
d1.a=10;
d1.c=100;
System.out.println(d1.a+d1.b+d1.c);
Demo d2=new Demo();
System.out.println(d1.a+d1.b+d1.c);
d1.a=500;
System.out.println(d1.a+d1.b+d1.c);

}





