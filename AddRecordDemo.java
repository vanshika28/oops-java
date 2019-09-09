import java.sql.*;
import java.util.Scanner;
class AddRecordDemo{
	public static void main(String ar[])
	{   
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter Employee no");
		int eno = s1.nextInt();
		System.out.println("Enter employee name ");
		String en = s1.next();
		System.out.println("Enter Employee Salary");
		int sal= s1.nextInt();
		System.out.println("Enter Department name");
		String dname = s1.next();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/devops?user=root&password=");
			String qry = " insert into scm values(?,?,?,?)";
			PreparedStatement ps =con.prepareStatement(qry);
			ps.setInt(1,eno);
			ps.setString(2,en);
			ps.setInt(3,sal);
			ps.setString(4,dname);
			
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
}