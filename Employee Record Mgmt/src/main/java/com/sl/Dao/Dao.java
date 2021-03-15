package com.sl.Dao;

import java.util.List;

import com.sl.Entity.Employee;
import com.sl.Entity.Feedback;

public interface Dao {

	void saveEmployee(Employee emp);

	List<Employee> getRecords();
	
	List<Employee> LoginEmp(String name, String password);

	Employee getById(Integer id);

	void deleteEmp(Employee emp);

	void saveFeedback(Feedback emp);
}
