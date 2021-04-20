
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLclass extends Third{
	
	static MySQLConnection myconn;
	static Connection conn;
	
	static void selectDepartment()
	{
		conn=myconn.mySqlDBConnection();
		//String sqlQuery = "select deptId,deptName from department where deptId > ?";
		String addQuery = "insert into loginID1 values(?,?,?,?,?)";
		//String addQuery2 = "insert into IncomePanID values(?,?,?,?)";
		//String updateQuery = "update * from loginID1";
		//String deleteQuery = "delete from department where deptId = 10";
		String displayQuery = "select * from loginID1 group by uid";
		try
		{
//		PreparedStatement psmt = conn.prepareStatement(sqlQuery);
//		psmt.setInt(1,100);
		PreparedStatement psmt1 = conn.prepareStatement(addQuery);
		psmt1.setString(1,getUid());
		psmt1.setString(2, getPwd());
		psmt1.setString(3, getPhonenumber());
		psmt1.setInt(4, getAge());
		psmt1.setString(5, getCity());
		psmt1.executeUpdate();
		//PreparedStatement psmt2 = conn.prepareStatement(addQuery2);
//		PreparedStatement psmt2 = conn.prepareStatement(updateQuery);
//		psmt2.execute();
		PreparedStatement psmt3 = conn.prepareStatement(displayQuery);
		psmt3.execute();
		ResultSet rs = psmt3.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getInt(4)+" ");
			System.out.print(rs.getString(5));
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
		finally
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