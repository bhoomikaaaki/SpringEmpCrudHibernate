package com.sritech.emp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import com.sritech.emp.dao.EmployeeDAO;
import com.sritech.emp.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployeeList() {
		Session session = sessionFactory.openSession();
	Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		return list;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Employee where Emp_id=:id");
		query.setParameter("id", id);
		List<Employee> list = query.list();
		
		Employee student = list.get(0);
		
		return student;	
		}

	@Override
	public int addEmployeeRecord(Employee employee) {
		
		System.out.println("=============================");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		System.out.println("sucessfully inserted");
		int count=1;
		return count;
	}

	@Override
	public int updateEmployeeRecord(Employee employee) {

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Query query = session.createQuery("update Employee set EMP_Name=:name,EMP_JOB=:job,EMP_SALARY=:salary,EMP_DEPT_NAME=:dept,EMP_AGE=:age,EMP_GENDER=:gender where Emp_id=:id");
		
		query.setParameter("name", employee.getEmpName());
		query.setParameter("job", employee.getEmpJob());
		query.setParameter("salary", employee.getEmpSalary());
		query.setParameter("dept", employee.getEmpDeptName());
		query.setParameter("age", employee.getEmpAge());
		query.setParameter("gender", employee.getEmpGender());
		query.setParameter("id", employee.getEmpId());
		
		
		
		int count = query.executeUpdate();
		
		transaction.commit();

		System.out.println("sucessfully updated");
		return count;
	}

	@Override
	public int deleteEmployeeById(Integer id) {


		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("delete from Employee where Emp_id=:id");
		query.setParameter("id", id);
		int count = query.executeUpdate();
		
		transaction.commit();

		return count;
	}

}
