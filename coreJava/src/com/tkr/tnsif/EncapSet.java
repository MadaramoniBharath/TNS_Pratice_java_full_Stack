package com.tkr.tnsif;

public class EncapSet {
	
	private int sno;
	private String name;
	private String college;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "EncapSet [sno=" + sno + ", name=" + name + ", college=" + college + "]";
	}
	
	public String toString1() {
		return "EncapSet [sno=" + sno + ", college =" + college +"]";
	}
	
	public String toString2() {
		return "[college name: " +college + "name of student:"+college + "]";
	}
	
	public String source() {
		return "EncapSet [sno=" + sno + ", college =" + college +"]";
	}
	public int teegala() {
		return 81858806;
	}
	

}
