package com.sritech.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Spring_Employee")
public class Employee {
	
	
	@Id
	@Column(name="Emp_id")
	private Integer empId;
	
	@Column(name="EMP_Name")
	private String empName;
	
	@Column(name="EMP_JOB")
	private String empJob;
	
	@Column(name="EMP_SALARY")
	private Double empSalary;
	
	@Column(name="EMP_DEPT_NAME")
	private String empDeptName;
	
	@Column(name="EMP_AGE")
	private Integer empAge;
	
	@Column(name="EMP_GENDER")
	private String empGender;
	
	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpJob() {
		return empJob;
	}


	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}


	public Double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpDeptName() {
		return empDeptName;
	}


	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}


	public Integer getEmpAge() {
		return empAge;
	}


	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}


	public String getEmpGender() {
		return empGender;
	}


	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}


	@Override
	public String toString() {
		return  empId + "\t" + empName + "\t" + empJob + "\t" + empSalary
				+"\t" + empDeptName + "\t"+ empAge + "\t"+ empGender ;
	}
	
	
	
	

}
