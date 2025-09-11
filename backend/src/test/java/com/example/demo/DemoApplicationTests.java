package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Disabled;


@SpringBootTest
@Disabled("Disabled: requires Docker env to run")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
