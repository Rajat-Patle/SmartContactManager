package com.scm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scm.services.EmailService;

@SpringBootTest
public class SmartContactManagerApplicationTests
{

	@Test
	void contextLoads() {
	}

    @Autowired
    private EmailService emailService;

    @Test
    void sendEmailTest() {
        emailService.sendEmail(
                "patlerajat18@gmail.com",
                "Testing email service of Smart Contact Manager",
                "Testing going on of Smart Contact Manager.");
    }

}
