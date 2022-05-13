package interview;

public class Duplicates {

	public static void main(String[] args) {
		String arr[]= {"kiran","sai","upendra","vasu","sai"};
		boolean flag=false;
		for(int i=0;i<=arr.length;i++) {
			for(int j=1;j<=arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found duplicate element:"+arr[i]);
					flag=true;
				}
			}
		}
		if (flag==false) {
			System.out.println("Duplicate element not found");
		}

	}

}
