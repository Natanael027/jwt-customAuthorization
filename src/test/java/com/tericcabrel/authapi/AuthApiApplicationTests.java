package com.tericcabrel.authapi;

import com.tericcabrel.authapi.entities.Role;
import com.tericcabrel.authapi.entities.User;
import com.tericcabrel.authapi.repositories.RoleRepository;
import com.tericcabrel.authapi.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class AuthApiApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void CreateRolesTest(){
		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		Role path1Role = new Role();
		path1Role.setName("ROLE_PATH1");
		Role path2Role = new Role();
		path2Role.setName("ROLE_PATH2");
		Role path3Role = new Role();
		path3Role.setName("ROLE_PATH3");

		roleRepository.save(userRole);
		roleRepository.save(path1Role);
		roleRepository.save(path2Role);
		roleRepository.save(path3Role);
	}
	@Test
	public void testUserFindByEmail() {
		Optional<User> userOpt = userRepository.findByEmail("testing3@example.com");
		Assertions.assertTrue(userOpt.isPresent());
		User user = userOpt.get();
		System.out.println(user.toString());
		Assertions.assertNotNull(user);
		// Further assertions
	}

}
