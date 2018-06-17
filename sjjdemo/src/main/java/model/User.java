package model;

public class User {
	
	private int id;
	private String password;
	private String username;
	private String usertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", username=" + username + ", usertype=" + usertype + "]";
	}
	


	
	
	

	
	
}
