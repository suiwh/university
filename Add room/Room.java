package HotelEntity;

public class Room {
	private int rid;
	private String rtype;
	private int state;
	private int cid;
	private String cname;
	private int rcost;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int rid, String rtype, int state, int cid, String cname, int rcost) {
		super();
		this.rid = rid;
		this.rtype = rtype;
		this.state = state;
		this.cid = cid;
		this.cname = cname;
		this.rcost = rcost;
	}
	public Room(int rid, String rtype,int state,int rcost)
	{
		super();
		this.rid = rid;
		this.rtype = rtype;
		this.state = state;
		this.rcost = rcost;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRcost() {
		return rcost;
	}
	public void setRcost(int rcost) {
		this.rcost = rcost;
	}
	
	
}