package com.jpa.hibernate.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.hibernate.demo1.entity.Course;
import com.jpa.hibernate.demo1.repository.CourseRepository;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repository.findById(10001L);
	    logger.info("Course 10001 -> {}",course);
	}
}
