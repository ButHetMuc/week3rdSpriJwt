package week3.demo.services;

import java.util.List;

import week3.demo.domain.Role;
import week3.demo.domain.User;

public interface UserService {
	User saveUser(User user);
	Role saveRole(Role role);
	void addRoleToUser(String userName,String roleName);
	User getUser(String userName);
	List<User> getUsers();
	

}
