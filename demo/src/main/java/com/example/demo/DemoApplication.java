package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.DemoRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	DemoRepository demoRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"Aarti","Pune");
		Student s2 = new Student(2,"Aditya","Delhi");
		
		demoRepository.student.addAll(Arrays.asList(s1,s2));
	}
	

}
