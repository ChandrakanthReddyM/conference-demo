package com.pluralsight.conferencedemo;

import com.pluralsight.conference.ConferenceDemo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConferenceDemo.class)
class ConferenceDemoTests {

	@Test
	public void contextLoads() {
	}

}
