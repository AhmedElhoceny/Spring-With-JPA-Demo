package com.Elhoceny.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Elhoceny.Models.Employee;
import com.Elhoceny.Services.EmployeeServices;

@RestController
@RequestMapping("/hr/v1")
public class HrController {
	
	private EmployeeServices _employeeService;
	
	@Value("${Developer-Name}")
	String DeveloperName ;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> GetEmployees() {

		System.out.println("Developer By : " + DeveloperName);
		return new ResponseEntity<List<Employee>>(_employeeService.GetAllEmployees() , HttpStatus.OK);
	}	
	@RequestMapping(path = "/findemployee" )
	public ResponseEntity<Employee> FindEmployee(@RequestParam String username ) {
		return new ResponseEntity<Employee>(_employeeService.FindEmployees(username) , HttpStatus.OK);
	}	
	@GetMapping("/:{departmentId}/Employees")
	public ResponseEntity<List<Employee>> GetDepartmentEmployees(@PathVariable long departmentId){
		return new ResponseEntity<List<Employee>>(_employeeService.GetDepartmentEmployees(departmentId) , HttpStatus.OK);
	}
}