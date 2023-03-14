package com.Elhoceny.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Elhoceny.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("select * from Employee where username = : username")
	public Employee GetEmployeeByName(@Param("username") String name );
	
	public List<Employee> findByDepartmentId(long departmentId);
}
