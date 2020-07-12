package cn.tedu.mybatis;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
	
	MapperScannerConfigurer msc;
	SqlSessionFactoryBean ssfb;

	@Test
	public void getConnection() throws SQLException {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		DataSource dataSource 
			= ac.getBean("dataSource", DataSource.class);
		
		// 测试：通过数据源获取数据库连接对象
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void addnew() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		User user = new User();
		user.setUsername("Spring");
		user.setPassword("123456");
		Integer rows = userMapper.addnew(user);
		System.out.println("rows=" + rows);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void deleteById() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		Integer id = 3;
		Integer rows = userMapper.deleteById(id);
		System.out.println("rows=" + rows);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void updatePassword() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		String password = "1234";
		Integer rows = userMapper.updatePassword(password);
		System.out.println("rows=" + rows);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void findAll() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		List<User> users = userMapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void count() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
		
		// 测试
		Integer count = userMapper.count();
		System.out.println("count=" + count);
		
		// 释放资源
		ac.close();
	}
	

	@Test
	public void findById() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		Integer id = 11;
		User user = userMapper.findById(id);
		System.out.println(user);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void updatePasswordById() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		Integer id = 1;
		String password = "111111";
		Integer rows = userMapper.updatePasswordById(id, password);
		System.out.println("rows=" + rows);
		
		// 释放资源
		ac.close();
	}

	@Test
	public void deleteByIds() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(7);
		ids.add(4);
		ids.add(9);
		ids.add(11);
		Integer rows = userMapper.deleteByIds(ids);
		System.out.println("rows=" + rows);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void findUserById() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// 测试
		Integer id = 8;
		UserVO user = userMapper.findUserById(id);
		System.out.println(user);
		
		// 释放资源
		ac.close();
	}
	
	@Test
	public void findDepartmentById() {
		// 加载Spring的配置文件
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// 获取对象
		DepartmentMapper departmentMapper
			= ac.getBean("departmentMapper", DepartmentMapper.class);
				
		// 测试
		Integer id = 1;
		DepartmentVO department = departmentMapper.findById(id);
		System.out.println(department);
		
		// 释放资源
		ac.close();
	}
	
}








