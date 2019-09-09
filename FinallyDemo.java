import java.util.Scanner;
class Divide{
	public static int divideNumber(int a,int b){
		try{
			return a/b;
		}
		catch(Exception e){
			System.out.println("hello ....i am last statment");
		    return 0;
		}
	}
}
class FinallyDemo{
	public static void main(String ar[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int k=Divide.divideNumber(a,b);
		System.out.println("Result is dividsion"+k);
	}
}