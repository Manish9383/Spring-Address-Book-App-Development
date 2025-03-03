package com.bridgelabz.springaddressbookapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringAddressBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAddressBookApplication.class, args);
		log.info("Address Book App Started");
	}

}