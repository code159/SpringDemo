package dao.jdbctemplate;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class JDBCTest {
	private ApplicationContext ctx=null;
	private JdbcTemplate jdbcTemplate=null;
	{
		ctx=new ClassPathXmlApplicationContext("dao/jdbctemplate/datasource.xml");
		jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplate");
	}

	@Test
	public void testC3P0() throws SQLException {
		DataSource ds=(DataSource) ctx.getBean("c3p0");
		System.out.println(ds.getConnection());
	}
	
	@Test
	public void testInsert(){
		String sql="insert into t values(?,?)";
		jdbcTemplate.update(sql, 2, "yubin");
	}
	
	@Test
	public void testBatchInsert(){
		String sql="insert into t values(?,?)";
		List<Object[]> batchArgs=new ArrayList<>();
		batchArgs.add(new Object[]{1,"a"});
		batchArgs.add(new Object[]{2,"b"});
		batchArgs.add(new Object[]{3,"c"});
		batchArgs.add(new Object[]{4,"d"});
		batchArgs.add(new Object[]{5,"e"});
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}
	
	/**
	 * orm：数据库的一个表对应于一个类，一列代表一个属性
	 * sql中的列别名完成列名与属性名的映射。默认列名last_name自动映射到属性名lastName
	 * 不支持级联属性。说明JdbcTemplate只是spring的一个小工具，而不是orm框架
	 */
	@Test
	public void testQueryById(){
		String sql="select id,name,last_name from t where id=?";
		RowMapper<TDao> rowMapper=new BeanPropertyRowMapper<>(TDao.class);
		TDao tdao=jdbcTemplate.queryForObject(sql, rowMapper, 10);
		System.out.println(tdao);
	}
	
	/**
	 * 统计
	 */
	@Test
	public void testQuery(){
		String sql="select count(id) from t where id=?";
		RowMapper<TDao> rowMapper=new BeanPropertyRowMapper<>(TDao.class);
		long count=jdbcTemplate.queryForLong(sql, 1);
		System.out.println(count);
	}
	
	/**
	 * 查实体类的集合
	 */
	@Test
	public void testQueryList(){
		String sql="select id,name,last_name from t where id=?";
		RowMapper<TDao> rowMapper=new BeanPropertyRowMapper<>(TDao.class);
		List<TDao> lists=jdbcTemplate.query(sql, rowMapper, 1);
		for(TDao d:lists){
			System.out.println(d);
		}
	}
	
	@Test
	public void testUpdate(){
		String sql="update t set name=? where id=?";
		jdbcTemplate.update(sql,"liyubin",1);
	}
	



}
