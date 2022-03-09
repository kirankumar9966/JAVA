class Demo{
	public static void main(String []args){
		int a=100;
		int b=200;
		int c=500;
		String d="kiran";
    System.out.println(a+b); //300
    System.out.println(a+b+c+d); //800kiran
    System.out.println(a+d+b+c);  //100kiran200500
    System.out.println(d+a+b+c);  //kiran100200500
	}
}
