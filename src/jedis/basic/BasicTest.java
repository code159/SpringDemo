package jedis.basic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class BasicTest {
	private String host="172.168.2.9";
	private int port=6379;
	private String password="redis";

	@Before
	public void setUp() throws Exception {
	}

	//单实例测试
	@Test
	public void single() {
		// 连接单实例
		Jedis jedis = new Jedis(host, port);
		jedis.auth(password);
		// 保存数据
		jedis.set("name", "liyubin");
		// 获取数据
		System.out.println(jedis.get("name"));
		jedis.close();
	}
	
	//连接池
	@Test
	public void pool(){
		//获得连接池对象
		JedisPoolConfig conf=new JedisPoolConfig();
		//设置最大连接数
		conf.setMaxTotal(30);
		//设置最大空闲连接数
		conf.setMaxIdle(10);
		
		//获得连接池
		JedisPool jedisPool=new JedisPool(conf,host,port);
		//获得核心对象
		Jedis jedis=null;
		try{
			//通过连接池建立连接
			jedis=jedisPool.getResource();
			jedis.auth(password);
			jedis.set("pool", "mypool");
			System.out.println(jedis.get("pool"));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(jedis!=null){
				jedis.close();
			}
			if(jedisPool!=null){
				jedisPool.close();
			}
		}
	}

}
