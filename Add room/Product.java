package HotelEntity;

public class Product {
	
  private int pid;
  private String pname;
  private int pcost;
  private int count;
  public Product(int pid,String pname, int pcost,int count)
  {
	  this.pid = pid;
	  this.pname = pname;
		this.pcost = pcost;
		this.count=count;
  }
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPcost() {
	return pcost;
}
public void setPcost(int pcost) {
	this.pcost = pcost;
}
  
}
