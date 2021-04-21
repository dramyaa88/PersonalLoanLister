
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLclass extends Third{
	
	static MySQLConnection myconn;
	static Connection conn;
	
	static boolean validate(String uid,String pwd)
	{
		String displayQuery3="select * from login where uid=? and pwd=?";
		
		try {
			Connection c=myconn.mySqlDBConnection();
			PreparedStatement p=c.prepareStatement(displayQuery3);
			p.setString(1,uid);
			p.setString(2, pwd);
			
			p.execute();
			ResultSet rsp=p.executeQuery();
			
			while(rsp.next())
			{
				rsp.getString("uid");
				rsp.getString("pwd");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
//	static void retrieve()
//	{
//		String sqlQuery="select * from login where uid=? and pwd=?";
//		
//	}
	static void selectDepartment()
	{
		conn=myconn.mySqlDBConnection();
		//String sqlQuery = "select deptId,deptName from department where deptId > ?";
		String addQuery = "insert into login values(?,?)";
		String addQuery1 = "insert into personalDetails values(?,?,?,?,?,?)";
		String addQuery2 = "insert into loanDetails values(?,?,?,?,?)";
		//String addQuery2 = "insert into IncomePanID values(?,?,?,?)";
		//String updateQuery = "update * from loginID1";
		//String deleteQuery = "delete from department where deptId = 10";
		String displayQuery = "select * from login group by uid";
		String displayQuery1 = "select * from personalDetails group by uid";
		String displayQuery2 = "select * from loanDetails group by uid";
		try
		{
//		PreparedStatement psmt = conn.prepareStatement(sqlQuery);
//		psmt.setInt(1,100);
			
		PreparedStatement psmt1 = conn.prepareStatement(addQuery);
		psmt1.setString(1,getUid());
		psmt1.setString(2, getPwd());
		psmt1.executeUpdate();
		//psmt1.execute();
		
		
		
		
//		PreparedStatement psmt2 = conn.prepareStatement(updateQuery);
//		psmt2.execute();
		
		PreparedStatement psmt3 = conn.prepareStatement(displayQuery);
		psmt3.execute();
		
		
		
		
		ResultSet rs = psmt3.executeQuery();
		
		
		
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.println();
//		
		}
		while(rs.next())
		{
			System.out.println();
		}
		
		
		
		
		
		
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
//		finally
//		{
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		try
		{
			PreparedStatement psmt2 = conn.prepareStatement(addQuery1);
			psmt2.setString(1,getUid());
			psmt2.setString(2, getPhonenumber());
			psmt2.setString(3,getName());
			psmt2.setInt(4, getAge());
			psmt2.setString(5, getCity());	
			psmt2.setString(6,getPan());
			psmt2.executeUpdate();
			
			PreparedStatement psmt5 = conn.prepareStatement(displayQuery1);
			psmt5.execute();
			
			ResultSet rs1 = psmt5.executeQuery();
			
			while(rs1.next())
			{
				System.out.print(rs1.getString(1)+" ");
				System.out.print(rs1.getString(2)+" ");
				System.out.print(rs1.getString(3)+" ");
				System.out.print(rs1.getInt(4)+" ");
				System.out.print(rs1.getString(5)+" ");
				System.out.print(rs1.getString(6)+" ");
				System.out.println();
			}
			while(rs1.next())
			{
				System.out.println();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
		try
		{
			PreparedStatement psmt4 = conn.prepareStatement(addQuery2);
			psmt4.setString(1,getUid());
			psmt4.setInt(2,getSal());
			psmt4.setInt(3,getExpense());
			psmt4.setInt(4,getLoanAmount());
			psmt4.setInt(5,getTenure());
			psmt4.executeUpdate();
			
			PreparedStatement psmt6 = conn.prepareStatement(displayQuery2);
			psmt6.execute();
			
			ResultSet rs2 = psmt6.executeQuery();
			
			while(rs2.next())
			{
				System.out.print(rs2.getString(1)+" ");
				System.out.print(rs2.getInt(2)+" ");
				System.out.print(rs2.getInt(3)+" ");
				System.out.print(rs2.getInt(4)+" ");
				System.out.print(rs2.getInt(5)+" ");
				System.out.println();
			}
			
			while(rs2.next())
			{
				System.out.println();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	static void SelectQue()
//	{
//		conn=myconn.mySqlDBConnection();
//		String sqlQuery = "select uid,pwd from loginID1";
//		try {
//		PreparedStatement psmt = conn.prepareStatement(sqlQuery);
//		
//		psmt.executeQuery();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
	

}
