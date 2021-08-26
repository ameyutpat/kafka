package com.amey.publisher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amey.publisher.Utility.Constant;
import com.amey.publisher.model.Employee;

@RestController
@RequestMapping("/v.0/publish/{uuid}")
public class EmployeeController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping()
	public String getvalue(@PathVariable String uuid) {
		Employee emp = new Employee();
		emp.setDept("engineering");
		emp.setId(12l);
		emp.setName("Sapient...");
		ResponseEntity<Employee> result = restTemplate.postForEntity(Constant.BASE_URL + "/" + uuid, emp,
				Employee.class);

		return "Request Post Successfully" + result.getBody();
	}

	

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
