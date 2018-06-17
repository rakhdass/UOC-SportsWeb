package dao;


import java.sql.*;

import model.User;
public class LoginDao
{

	public User getUser(int id,String pw) 
	{
		User u =new User();
		try {
			String sql="SELECT * FROM users WHERE uid= "+ id;
			String url = "jdbc:mysql://localhost:3306/servlettest";
			String username= "root";
			String password="";
			

	        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	        Connection conn= DriverManager.getConnection(url,username,password);
	        Statement st= conn.createStatement();
	        
	        ResultSet rs=st.executeQuery(sql); 
			if(rs.next()) {
				u.setId(rs.getInt("uid"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
				
				
				
			}
			
			
		} catch (Exception e) {
		System.out.println(e);	
		}
		return u;
	}

}
