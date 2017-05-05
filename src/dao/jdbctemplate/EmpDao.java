package dao.jdbctemplate;

public class EmpDao {
	private Integer empId;
	private String ename;
	private String sex;
	private Integer deptId;
	private DeptDao dept;
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public EmpDao get(Integer empId, String ename, String sex, Integer deptId) {
		EmpDao ed=new EmpDao();
		ed.setDeptId(deptId);
		ed.setEmpId(empId);
		ed.setEname(ename);
		ed.setSex(sex);
		return ed;
	}
	public DeptDao getDept() {
		return dept;
	}
	public void setDept(DeptDao dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmpDao [empId=" + empId + ", ename=" + ename + ", sex=" + sex + ", deptId=" + deptId + ", dept=" + dept
				+ "]";
	}
}
