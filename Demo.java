import java.sql.*;
class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class load suuceefully");

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost/?user=Marvellous&password=Marvellous");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA","Marvellous@localhost","Marvellous");
			System.out.println("connection establish");
	
			Statement stmt=con.createStatement();
		
			System.out.println("connection establish succefully");
		
			ResultSet rs=stmt.executeQuery("select*from Student");

			System.out.println("data from student table");
	
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
			}
		}	
		catch(Exception e)
		{
			System.out.println("exception occure");
			
			System.out.println(e);
			e.printStackTrace();
		}
		/*
		finally
		{
			rs.close();
			stmt.close();
			con.close();
		}*/
	}
}
