package interview;

public class ReverseString {

	public static void main(String[] args) {
		String st="kirankumar";
		String rev="";
		int len=st.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println("Reversed String is :"+rev);
	}
}
