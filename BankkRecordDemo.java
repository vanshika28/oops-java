import java.sql.*;
import java.util.Scanner;
class BankRecordDemo{
	static connection con;
	static Scanner s1 = new Scanner(System.in);
	public static Connection myConnection(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc mysql :// local host/batch 22data?user=root& password=");
		return con;
	}
	catch (Exception e){
		System.out.println(e);
		return null;
	}
}
public static void openAccount(){
	Scanner s1 = new Scanner (System.in);
		System.out.println("Enter account no");
		int acno = s1.nextInt();
		System.out.println("Enter customer name ");
		String cname = s1.next();
		System.out.println("Enter account type");
		String actype = s1.next();
		System.out.println("Enter account balance");
		int bal= s1.next ();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/devops?user=root&password=");
			String qry = " insert into Customer values(?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(qry);
			ps.setInt(1,eno);
			ps.setString(2,cname);
			ps.setString(3,actype);
			ps.setString(4,bal);
			
			int a = ps.executeUpdate();
			if(a==0)
				System.out.println("update");
			else
				System.out.println("Record added");
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
}
public static void DisplayAccount(){
	try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/Bank?user=root&password=");
			String qry = " Select * from employee";
			PreparedStatement ps =con.prepareStatement(qry);
             Result rs = ps.execute Query();
            while (rs.next()){
				int acno= rs.get Int(1);
				string cname = rs.get String(2);
				String actype =rs.get String(3);
				int bal = rs.get Int(4);
				
		System.out.println("Enter account no"+acno);		
		
		System.out.println("Enter customer name "+cname);
		
		System.out.println("Enter account type"+actype);
		
		System.out.println("Enter account balance"+bal);
		
			}			 
			con.close();
			catch(Exception e){
			System.out.println(e);
		}
			
}
public static void closeAccount(){
	
} 
public static void main( String ar[]){
	int k=0
	do{
		System.out.println(" 1 --openAccount");
		System.out.println(" 2 -- DisplayAccount");
		System.out.println(" 3 --Deposit Money");
		System.out.println(" 4 --Withdraw Money");
		System.out.println(" 5 --Enquiry Account");
		System.out.println(" 6 --Close Account");
		System.out.println(" 7 --Transfer Money");
		System.out.println(" 8 --Exit");
		System.out.println(" Enter your choice");
		int ch = s1.next Int();
		switch (ch){
			case 1:
			
			
		}
	}
	
}
}