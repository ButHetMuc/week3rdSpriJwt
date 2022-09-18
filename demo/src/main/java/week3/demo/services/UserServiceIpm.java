package week3.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import week3.demo.domain.Role;
import week3.demo.domain.User;
import week3.demo.repo.RoleRepo;
import week3.demo.repo.UserRepo;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceIpm implements UserService {

	private final UserRepo userRepo = null ;
	private final RoleRepo roleRepo = null;
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		log.info("saving new user ", user.getName());
		return userRepo.save(user);
	}

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		log.info("saving new role to the database ",role.getName());
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String userName, String roleName) {
		log.info("adding role to user ",roleName,userName);
		User user = userRepo.findByUserName(userName);
		Role role = roleRepo.findByName(roleName);
		user.getRoles().add(role);
	}

	@Override
	public User getUser(String userName) {
		// TODO Auto-generated method stub
		log.info("fetching user" ,userName);
		return userRepo.findByUserName(userName);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		log.info("Fetching all users");
		return userRepo.findAll();
	}

}
