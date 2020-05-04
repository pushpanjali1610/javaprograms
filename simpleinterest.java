
	import java.util.Scanner;
	public class simpleinterest{
	public static void main(String[] args) {
		System.out.println("enter principle amount:");
			Scanner inp = new Scanner(System.in);
			int p = inp.nextInt();
			System.out.println("enter rate:");
			int r = inp.nextInt();
			System.out.println("enter time:");
			int t = inp.nextInt();
			int s;
			s=(p*r*t)/100;
			System.out.println("simple interest is :"+s);
	}
	}
			