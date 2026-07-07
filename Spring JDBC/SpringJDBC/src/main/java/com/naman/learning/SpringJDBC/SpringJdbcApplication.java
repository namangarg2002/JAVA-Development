package com.naman.learning.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.naman.learning.SpringJDBC.model.Alien;
import com.naman.learning.SpringJDBC.repository.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);

		Alien alien1 = context.getBean(Alien.class);

		alien1.setId(104);
		alien1.setName("Naman");
		alien1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());

	}

}
