package com.qa.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // sets the profile to test
class SpringUsersApplicationTests {

	@Test
	void contextLoads() {
	}

}
