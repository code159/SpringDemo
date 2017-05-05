package dao.jdbctemplate;

public class DeptDao {
	private Integer deptId;
	private String dname;
	private String location;
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "DeptDao [deptId=" + deptId + ", dname=" + dname + ", location=" + location + "]";
	}
	public DeptDao get(Integer deptId, String dname, String location) {
		DeptDao dd=new DeptDao();
		dd.setDeptId(deptId);
		dd.setDname(dname);
		dd.setLocation(location);
		return dd;
	}
}
