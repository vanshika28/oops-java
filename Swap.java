import java.util.Scanner;
class Swap{
    public static void main(String ar[])
	{int a,b;
	Scanner s1= new Scanner(System.in);
	
	System.out.println("Enter first no");
	 a = s1.nextInt();
	System.out.println("Enter second no");
	 b = s1.nextInt();

	 a=a+b;
	 b=a-b;
	 a=b-a;
	
	System.out.println ("Swapped no. are" +a +b);}
	
	}