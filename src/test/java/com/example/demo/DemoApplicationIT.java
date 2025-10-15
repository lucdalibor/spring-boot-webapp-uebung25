package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationIT {

	@Test
	void contextLoads() {
	}

	@Test
	void my_simple_unit_test() {
		System.out.println("This is a integration test!");
}
}
