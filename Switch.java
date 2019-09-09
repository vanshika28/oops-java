import java.util.Scanner;
class Switch{
    public static void main( String ar[])
	{ int k=0,i,l,p;
	
		System.out.println("Main menu");
		System.out.println(" 1 - Factorial of a number");
		System.out.println("2- Table of a number");
		System.out.println(" 3- Greater number");
		System.out.println(" 4- exit");
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter your choice");
		do 
		{
		int a =s1.nextInt();
		
		
		 switch(a){
			 case 1 :
				 System.out.println("Enter the no.");
				 int n = s1.nextInt();
				 int f =1;
				 for( i=1 ; i<=n; i++){
					 f = f*i ;
					}
				 System.out.println("Factorial is"+f);
			break ;
			case 2:
				System.out.println("Enter the number");
				 l = s1.nextInt();
				for(p=1 ; p<=10; p++){
					System.out.println(l+"*" +p+ "=" +l*p);
				}
			break ;
			case 3 :
				System.out.println("enter first number");
				int h = s1.nextInt();
				System.out.println("enter Second number");
				int j = s1.nextInt();
				if(h>j)
					System.out.println(h+"is greater than"+j );
				else
				System.out.println(j+"is greater than"+h );	
				break;
			case 4:
				System.exit(0); 
			default:
				System.out.println("Invalid choice");
		}
	}while (k!=1);
    
	}
}