package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import model.Alien;

public class AlienDao {
 public Alien getAlien(int id) {
	 Alien a= new Alien();
	
		
		try {
			String sql="SELECT * FROM alien WHERE id= "+ id;
			String url = "jdbc:mysql://localhost:3306/servlettest";
			String username= "root";
			String password="";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= DriverManager.getConnection(url,username,password);
			Statement st= conn.createStatement();
			
			ResultSet rs=st.executeQuery(sql );
			if(rs.next()) {
				a.setAid(rs.getInt("id"));
				a.setAname(rs.getString("name"));
				a.setTech(rs.getString("tech"));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	 return a;
	 
 }
}
