package model;

public class TournamentYear {
	private int tyid;
	private int year;
	public int getTyid() {
		return tyid;
	}
	public void setTyid(int tyid) {
		this.tyid = tyid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "TournamentYear [tyid=" + tyid + ", year=" + year + "]";
	}
	
	
}
