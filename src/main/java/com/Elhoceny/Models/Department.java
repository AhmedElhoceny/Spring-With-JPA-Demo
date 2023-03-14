package com.Elhoceny.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	@Column(name = "DepartmentName")
	public String DepartmentName;
	@Column(name = "RangSalary")
	public Double RangSalary;
}
