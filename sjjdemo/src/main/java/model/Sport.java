package model;

public class Sport {
	private int sid;
	private String sname;
	private int noOfPlayers;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", noOfPlayers=" + noOfPlayers + "]";
	}
	

}
