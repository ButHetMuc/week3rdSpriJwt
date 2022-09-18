package week3.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import week3.demo.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUserName(String userName);
}
