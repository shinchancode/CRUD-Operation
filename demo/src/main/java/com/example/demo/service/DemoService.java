package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	DemoRepository demoRepository;
	
	//CREATE
	public String add(Student st) {
		// TODO Auto-generated method stub
		return demoRepository.add(st);
	}
	
	//READ
	public List<Student> getAll()
	{
		return demoRepository.getAll();
	}

	//UPDATE
	public String edit(Student st) {
		// TODO Auto-generated method stub
		return demoRepository.edit(st);
	}

	//DELETE
	public String delete(int SId) {
		// TODO Auto-generated method stub
		return demoRepository.delete(SId);
	}
}
