package com.amey.consumer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amey.consumer.model.Employee;

@RequestMapping("/v.0/employee/{uuid}")
@RestController
public class SubController {
	
	@PostMapping()
	public Employee employee(@RequestBody Employee emp) {
		Employee data = new Employee();
		data.setName(emp.getName());
		data.setId(emp.getId());
		data.setDept(emp.getDept());
		System.out.println("Post For Object **"+data.getDept()+" Name::::  "+data.getName());
		
		return data;
	}

}
