package com.sl.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.Dao.Dao;
import com.sl.Entity.Employee;
import com.sl.Entity.Feedback;

@Service
public class ServiceEmpImpl implements ServiceEmp {

	@Autowired
	Dao dao;

	@Transactional
	public void SaveEmployee(Employee emp) {
		dao.saveEmployee(emp);
	}

	@Transactional
	public List<Employee> getRecords() {		
		return  dao.getRecords();
	}

	@Transactional
	public List<Employee> LoginEmp(String name, String password) {
		
		return dao.LoginEmp(name,password);
	}
	
	@Transactional
	public Employee getById(Integer id) {
		
		return dao.getById(id);
	}

	@Transactional
	public void deleteEmp(Employee emp) {
		dao.deleteEmp(emp);
		
	}

	@Transactional
	public void SaveFeedback(Feedback emp) {
		dao.saveFeedback(emp);
	}
}
