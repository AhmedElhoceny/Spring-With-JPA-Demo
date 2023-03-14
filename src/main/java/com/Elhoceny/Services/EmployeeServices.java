package com.Elhoceny.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Elhoceny.Repositories.EmployeeRepository;
import com.Elhoceny.Models.Employee;

@Service
public class EmployeeServices {
	
	private EmployeeRepository _employeeRepository; 
	
	public List<Employee> GetAllEmployees(){
		
		var data = _employeeRepository.findAll();
		if(data == null)
			return new ArrayList<Employee>();
		return data;
	}
public Employee FindEmployees(String UserName){
		
		var data = _employeeRepository.GetEmployeeByName(UserName);
		if(data == null)
			return new Employee();
		return data;
	}

public List<Employee> GetDepartmentEmployees(long DepartmentId){
	return _employeeRepository.findByDepartmentId(DepartmentId);
}
	
}
