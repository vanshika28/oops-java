import java.util.Scanner;
	class Sumatrix{
	  public static void main (String ar[])
	{
	int x[]= new int[5];
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter array Elements");
	int s=0; 
	for (int i=0;i<x.length;i++)
	{x[i]=s1.nextInt();
	s=s+x[i];
	}
	System.out.println("sum of matrix"+s);
	}
	}