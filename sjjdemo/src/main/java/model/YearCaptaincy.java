package model;

public class YearCaptaincy {
	private int ycid;
	private int year;
	private String captainName;
	
	public int getYcid() {
		return ycid;
	}
	public void setYcid(int ycid) {
		this.ycid = ycid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	@Override
	public String toString() {
		return "YearCaptaincy [ycid=" + ycid + ", year=" + year + ", captainName=" + captainName + "]";
	}
	

}
