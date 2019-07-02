package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.starter.util.EmailUtil;

@Component
public class ApplicationRunner implements CommandLineRunner {

	@Autowired
	private EmailUtil util;
	@Override
	public void run(String... args) throws Exception {

		ClassPathResource file = new ClassPathResource("abcd.txt");
		boolean flag = util.send("bhanu.maragani2@gmail.com", "AA", "Hello", file);
		if(flag)
			System.out.println("Sent");
		else
			System.out.println("Check problems");
	}

}
