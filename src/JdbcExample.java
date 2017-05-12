import java.sql.*;
public class JdbcExample {
	public static void main(String arg[])
	{
		try
		{
			//3rd
			//second commit
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from sample");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
