package com.sl.Service;

import java.util.List;

import com.sl.Entity.Employee;
import com.sl.Entity.Feedback;

public interface ServiceEmp {

	void SaveEmployee(Employee emp);
	
	void SaveFeedback(Feedback emp);

	List<Employee> getRecords();

	List<Employee> LoginEmp(String name, String password);

	Employee getById(Integer id);

	void deleteEmp(Employee emp);


}
