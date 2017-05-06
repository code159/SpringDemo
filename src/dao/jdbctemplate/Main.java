package dao.jdbctemplate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("dao/jdbctemplate/datasource.xml");
//		JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
//		EmpService es=new EmpServiceImpl(jdbcTemplate);
		
		EmpService es=(EmpService) ctx.getBean(EmpService.class);

//		
//		DeptDao dd=new DeptDao().get(1000,"alibaba","hangzhou");
//		es.addDept(dd);
//		
//		EmpDao ed=new EmpDao().get(1,"liyubin","男",1000);
//		es.addEmp(ed);
		
		System.out.println(es.getDept(1000));
		System.out.println(es.getEmp(1));
		
		ctx.close();
	}

}
