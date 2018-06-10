package model;

public class Tournament {
	private int tid;
	private int tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTname() {
		return tname;
	}
	public void setTname(int tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Tournament [tid=" + tid + ", tname=" + tname + "]";
	}
	

}
