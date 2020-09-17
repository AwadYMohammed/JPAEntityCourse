package com.jpa.hibernate.demo1.repository;

import javax.persistence.EntityManager;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.jpa.hibernate.demo1.entity.Course;
@Repository
public class CourseRepository implements CommandLineRunner {
	
	private org.jboss.logging.Logger logger = LoggerFactory.logger(this.getClass());

	@Autowired
	EntityManager em;
private CourseRepository repository;
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repository.findById(10001L);
		logger.infof("Course 1001 -> {}", course);

	}
}
