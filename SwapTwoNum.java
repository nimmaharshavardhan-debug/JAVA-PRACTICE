import java.util.Scanner;
public class SwapTwoNum
{
	public static void main(String[] args)
		{	
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter a Number : ");
			int a = obj.nextInt();
			System.out.print("Enter a Number : ");
			int b = obj.nextInt(),temp;
			System.out.println("Before Swapping");
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("After swapping");
			System.out.println("a = "+a);
			System.out.println("b = "+b);



		
		}
}