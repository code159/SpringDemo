package dao.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpServiceImpl implements EmpService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String INSERT_DEPT="insert into dept(dept_id,dname,location) values(?,?,?)";
	private final String INSERT_EMP="insert into emp(emp_id,ename,sex,dept_id) values(?,?,?,?)";
	private final String SELECT_DEPT="select dept_id,dname,location from dept where dept_id=?";
	private final String SELECT_EMP="select emp_id,ename,sex,dept_id from emp where emp_id=?";


	private RowMapper<DeptDao> deptRowMapper=new BeanPropertyRowMapper<>(DeptDao.class);
	private RowMapper<EmpDao> empRowMapper=new BeanPropertyRowMapper<>(EmpDao.class);
	
	
//	public EmpServiceImpl(JdbcTemplate jdbcTemplate){
//		this.jdbcTemplate=jdbcTemplate;
//	}

	@Override
	public void addDept(DeptDao dd) {
		jdbcTemplate.update(INSERT_DEPT, dd.getDeptId(),dd.getDname(),dd.getLocation());
	}

	@Override
	public void addEmp(EmpDao ed) {
		jdbcTemplate.update(INSERT_EMP, ed.getEmpId(),ed.getEname(),ed.getSex(),ed.getDeptId());
	}

	@Override
	public EmpDao getEmp(int empId) {
		return jdbcTemplate.queryForObject(SELECT_EMP, empRowMapper, empId);
	}

	@Override
	public DeptDao getDept(int deptId) {
		return jdbcTemplate.queryForObject(SELECT_DEPT, deptRowMapper, deptId);
	}

}
