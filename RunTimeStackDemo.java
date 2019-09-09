class RunTimeStackDemo{
	public static void main(String ar[]){
		m1();
	}
	public static void m1(){
	m2();
	
	}
	public static void m2(){
		m3();
		
	}
public static int m3(){
	try {return 10/0 ;}
	catch (Exception e){
		e.printStackTrace();
	}
	return 0;
   }
}
