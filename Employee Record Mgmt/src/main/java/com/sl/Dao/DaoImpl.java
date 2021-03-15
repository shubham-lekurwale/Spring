package com.sl.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sl.Entity.Employee;
import com.sl.Entity.Feedback;

@Repository
public class DaoImpl implements Dao {

	@Autowired
	private SessionFactory sf;

	public void saveEmployee(Employee emp) {
		sf.getCurrentSession().saveOrUpdate(emp);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getRecords() {
		return sf.getCurrentSession().createQuery("FROM Employee").list();
	}

	@SuppressWarnings("unchecked")
	public List<Employee> LoginEmp(String name, String password) {
		
		return sf.getCurrentSession().createQuery("FROM Employee WHERE name ='"+name+"' AND password = '"+password+"'").list();
	}

	public Employee getById(Integer id) {
		return  sf.getCurrentSession().get(Employee.class,id);
	}

	public void deleteEmp(Employee emp) {
		sf.getCurrentSession().delete(emp);
	}

	public void saveFeedback(Feedback emp) {
		sf.getCurrentSession().saveOrUpdate(emp);
	}	

}
