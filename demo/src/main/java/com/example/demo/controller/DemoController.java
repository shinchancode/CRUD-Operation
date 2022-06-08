package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	//CREATE
	@PostMapping("/add")
	public String getAll(@RequestBody Student st)
	{
		return demoService.add(st);
	}
	
	//READ	
	@GetMapping("/get/all")
	public List<Student> getAll()
	{
		return demoService.getAll();
	}
	
	//UPDATE
	@PutMapping("/edit")
	public String edit(@RequestBody Student st)
	{
		return demoService.edit(st);
	}
	
	//DELETE
	@DeleteMapping("/del")
	public String delete(@RequestParam int SId)
	{
		return demoService.delete(SId);
	}
	

}
