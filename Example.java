class Example{
	public static void main(String ar[]){
		int num1,num2;
		try{
			num1=0;
			num2=68/0;
			System.out.println("num2");
			System.out.println ("I am end of try block");
			
			
		}
		//catch(ArithmeticException e){
			//System.out.println("u should nt divide it by Zero");
		
		//}

		catch(Exception e){
			System.out.println("Exception ocuured");
		}
		System.out.println("i am out of try block");
		
	}
}