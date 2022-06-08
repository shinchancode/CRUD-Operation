package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;


@Repository
public class DemoRepository {

	public List<Student> student = new ArrayList<Student>();

	//CREATE
	public String add(Student st) {
		student.add(st);
		
		return "Successfully Added";
	}
	
	//READ
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return student;
	}

	//UPDATE
	public String edit(Student st) {
		student.stream().filter(e -> e.getStudentId()==st.getStudentId()).forEach(e->{
			e.setAddress(st.getAddress());
			e.setName(st.getName());
		});
		return "SUCCESSFULLY UPDATED";
	}

	//DELETE
	public String delete(int sId) {
		// TODO Auto-generated method stub
		student.remove(sId-1);
		return "SUCCESSFULLY DELETED";
	}


}
