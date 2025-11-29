package com.codingshuttle.SpringSecurity;

import com.codingshuttle.SpringSecurity.entity.User;
import com.codingshuttle.SpringSecurity.service.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Autowired
    private JwtService jwtService;

	@Test
	void contextLoads() {
        User user = new User(2L,"riyaz@gmail.com","1234");
        System.out.println("Token Generation");
        String token = jwtService.generateAccessToken(user);
        System.out.println(token);
        Long id = jwtService.getUserIdFromToken(token);
        System.out.println(id);
	}

}
