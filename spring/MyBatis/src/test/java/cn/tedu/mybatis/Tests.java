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
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		DataSource dataSource 
			= ac.getBean("dataSource", DataSource.class);
		
		// ���ԣ�ͨ������Դ��ȡ���ݿ����Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void addnew() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		User user = new User();
		user.setUsername("Spring");
		user.setPassword("123456");
		Integer rows = userMapper.addnew(user);
		System.out.println("rows=" + rows);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void deleteById() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		Integer id = 3;
		Integer rows = userMapper.deleteById(id);
		System.out.println("rows=" + rows);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void updatePassword() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		String password = "1234";
		Integer rows = userMapper.updatePassword(password);
		System.out.println("rows=" + rows);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void findAll() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		List<User> users = userMapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void count() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
		
		// ����
		Integer count = userMapper.count();
		System.out.println("count=" + count);
		
		// �ͷ���Դ
		ac.close();
	}
	

	@Test
	public void findById() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		Integer id = 11;
		User user = userMapper.findById(id);
		System.out.println(user);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void updatePasswordById() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		Integer id = 1;
		String password = "111111";
		Integer rows = userMapper.updatePasswordById(id, password);
		System.out.println("rows=" + rows);
		
		// �ͷ���Դ
		ac.close();
	}

	@Test
	public void deleteByIds() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(7);
		ids.add(4);
		ids.add(9);
		ids.add(11);
		Integer rows = userMapper.deleteByIds(ids);
		System.out.println("rows=" + rows);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void findUserById() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
				
		// ����
		Integer id = 8;
		UserVO user = userMapper.findUserById(id);
		System.out.println(user);
		
		// �ͷ���Դ
		ac.close();
	}
	
	@Test
	public void findDepartmentById() {
		// ����Spring�������ļ�
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		// ��ȡ����
		DepartmentMapper departmentMapper
			= ac.getBean("departmentMapper", DepartmentMapper.class);
				
		// ����
		Integer id = 1;
		DepartmentVO department = departmentMapper.findById(id);
		System.out.println(department);
		
		// �ͷ���Դ
		ac.close();
	}
	
}








