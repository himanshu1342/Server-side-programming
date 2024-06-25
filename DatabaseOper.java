package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseOper {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUD","root","jneccse");
		 System.out.println("connection created");
		 
		 Statement stmt=con.createStatement();
		 String sql2 = "insert into student values(109,'Manoj','Jalna')";
		 int nor= stmt.executeUpdate(sql2);
			
			String sql1 ="Select * from student";
			
			ResultSet rs=stmt.executeQuery(sql1);
			int cnt=1;
			while(rs.next()){
				int roll=rs.getInt("rollno");
				String name=rs.getString("name");
				String city=rs.getString("city");
				System.out.println(cnt+ " "+roll+" "+name+" "+city+" ");

				cnt++;
			

	}


	}

}
