package cn.tedu.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	Integer addnew(User user);
	
	Integer deleteById(Integer id);
	
	Integer updatePassword(String password);
	
	List<User> findAll();
	
	Integer count();
	
	User findById(Integer id);

	Integer updatePasswordById(
		@Param("id") Integer id, 
		@Param("password") String password);
	
	Integer deleteByIds(List<Integer> ids);
	
	UserVO findUserById(Integer id);
	
}






