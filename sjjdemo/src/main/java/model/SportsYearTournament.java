package model;

public class SportsYearTournament {
	private int sytid;
	private String sytname ;
	public int getSytid() {
		return sytid;
	}
	public void setSytid(int sytid) {
		this.sytid = sytid;
	}
	public String getSytname() {
		return sytname;
	}
	public void setSytname(String sytname) {
		this.sytname = sytname;
	}
	@Override
	public String toString() {
		return "SportsYearTournament [sytid=" + sytid + ", sytname=" + sytname + "]";
	}
	

}
