package com.healtcare.entites;

public class Product {
	private int Pid;
	private String Pname;
	private String Pbrand;
	private String Ptype;
	private String PimageName;
	private String Pdescription;
	private double PquantityAvaiable;
	private double PunitPrice;
	private boolean PisAvailable;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int pid, String pname, String pbrand, String ptype, String pimageName, String pdescription,
			double pquantityAvaiable, double punitPrice, boolean pisAvailable) {
		super();
		Pid = pid;
		Pname = pname;
		Pbrand = pbrand;
		Ptype = ptype;
		PimageName = pimageName;
		Pdescription = pdescription;
		PquantityAvaiable = pquantityAvaiable;
		PunitPrice = punitPrice;
		PisAvailable = pisAvailable;
	}
	
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPbrand() {
		return Pbrand;
	}
	public void setPbrand(String pbrand) {
		Pbrand = pbrand;
	}
	public String getPtype() {
		return Ptype;
	}
	public void setPtype(String ptype) {
		Ptype = ptype;
	}
	public String getPimageName() {
		return PimageName;
	}
	public void setPimageName(String pimageName) {
		PimageName = pimageName;
	}
	public String getPdescription() {
		return Pdescription;
	}
	public void setPdescription(String pdescription) {
		Pdescription = pdescription;
	}
	public double getPquantityAvaiable() {
		return PquantityAvaiable;
	}
	public void setPquantityAvaiable(double pquantityAvaiable) {
		PquantityAvaiable = pquantityAvaiable;
	}
	public double getPunitPrice() {
		return PunitPrice;
	}
	public void setPunitPrice(double punitPrice) {
		PunitPrice = punitPrice;
	}
	public boolean isPisAvailable() {
		return PisAvailable;
	}
	public void setPisAvailable(boolean pisAvailable) {
		PisAvailable = pisAvailable;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pbrand=" + Pbrand + ", Ptype=" + Ptype + ", PimageName="
				+ PimageName + ", Pdescription=" + Pdescription + ", PquantityAvaiable=" + PquantityAvaiable
				+ ", PunitPrice=" + PunitPrice + ", PisAvailable=" + PisAvailable + "]";
	}
	
	

}
