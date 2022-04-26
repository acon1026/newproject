package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDao {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	
	Connection con=null;
	
	
	public void updatePassword(String snumber, String name) {
		
		
		try {
			dbCon();
			
			String sql = "update student_info set name = ? where snumber = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2,  snumber);
			
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public Student getStudent(int snumber) {
		Student s =null;
		dbCon();
		String sql="select * from student_info where snumber =?";
		PreparedStatement pst;
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, snumber);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next()) {
				
				s = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
		
	}
	

	public void insertMember(Student s) { 
		
		try {
			
			dbCon();
			String sql="insert into student_info values(?,?,?,?,?,?,?)" ;
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setInt(1, s.getSnumber());
			pst.setString(2, s.getName());
			pst.setInt(3, s.getKor());
			pst.setInt(4, s.getEng());
			pst.setInt(5, s.getMath());
			pst.setInt(6, s.getTotal());
			pst.setDouble(7, s.getAvg());						
			pst.executeUpdate();
			
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
 
	
	
	
	public ArrayList<Student> listMembers(){
				
		ArrayList<Student> list = new ArrayList<>();
		 try {
			 
			 
			dbCon();
			Statement st  =con.createStatement();
			String sql="select * from student_info";
			ResultSet rs  =st.executeQuery(sql);
			
			while( rs.next()) {
				Student s = new Student (rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getDouble(7));
				list.add(s);
			}	
			
			rs.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {			 
			e.printStackTrace();
		}		 
		 
		 return list;
		
		 
	}
	
	
	
	
	
	private void dbCon() {			
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	
	
	
	

}
