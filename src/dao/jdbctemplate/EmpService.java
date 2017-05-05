package dao.jdbctemplate;

public interface EmpService {
	void addDept(DeptDao dd);
	void addEmp(EmpDao ed);
	EmpDao getEmp(int empId);
	DeptDao getDept(int deptId);
}
