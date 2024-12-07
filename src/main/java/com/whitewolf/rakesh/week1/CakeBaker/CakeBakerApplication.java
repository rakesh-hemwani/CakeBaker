package com.whitewolf.rakesh.week1.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CakeBakerApplication implements CommandLineRunner{

	@Autowired
	CakeBaker cakeBaker;


	public static void main(String[] args) {
		SpringApplication.run(CakeBakerApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
