package week3.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import week3.demo.domain.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String userName);
}
