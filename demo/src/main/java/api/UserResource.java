package api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import week3.demo.domain.User;
import week3.demo.services.UserService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
	private final UserService userService = null;
	
	@GetMapping ("/users")
	public ResponseEntity<List<User>> getUsers(){
		 return ResponseEntity.ok().body(userService.getUsers());
	}
}
