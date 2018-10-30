package com.test.sp.vo;

public class TtInfo {

	private Integer tnum;
	private String tname;
	private Integer tage;
	
	public Integer getTnum() {
		return tnum;
	}
	public void setTnum(Integer tnum) {
		this.tnum = tnum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
	@Override
	public String toString() {
		return "TtInfo [tnum=" + tnum + ", tname=" + tname + ", tage=" + tage + "]";
	}
}
