import java.util.Scanner;
class Swapc{
    public static void main(String ar[])
	{int a,b;
	Scanner s1= new Scanner(System.in);
	
	System.out.println("Enter first no");
	 a = s1.nextInt();
	System.out.println("Enter second no");
	 b = s1.nextInt();
	 int c;
	 c=a;
	 a=b;
	 b=c;
	System.out.println ("Swapped no. are" +a +b);}
	}