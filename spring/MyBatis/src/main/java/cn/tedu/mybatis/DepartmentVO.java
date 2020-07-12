package cn.tedu.mybatis;

import java.util.List;

public class DepartmentVO {

	private Integer id;
	private String name;
	private List<User> users;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "DepartmentVO [id=" + id + ", name=" + name + ", users=" + users + "]";
	}

}
