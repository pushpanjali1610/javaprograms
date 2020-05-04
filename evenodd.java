import java.util.Scanner;

public class evenodd {
	public static void main(String [] args) {
		 int a;
		  	System.out.println("Enter the num find even or odd  :");
		  	 Scanner input= new Scanner(System.in);
		  	 a =input.nextInt();
		  	if(a%2==0) {
		  		System.out.println(a + " is even num ");
		  	}
		  	else
		  		System.out.println(a + " is  not even num");
	}

}
