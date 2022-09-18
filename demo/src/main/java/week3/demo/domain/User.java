package week3.demo.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class User {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String userName;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<week3.demo.domain.Role> roles = new ArrayList<week3.demo.domain.Role>();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<week3.demo.domain.Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<week3.demo.domain.Role> roles) {
		this.roles = roles;
	}

}
