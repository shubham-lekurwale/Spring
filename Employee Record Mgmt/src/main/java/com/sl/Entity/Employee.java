package com.sl.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "Id")
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name = "system-increment", strategy = "increment")
	private Integer id;

	@Size(min = 1, message = "Name shuld not Null")
	@Column(name = "Name")
	private String name;
	
	@Size(min = 1, message = "Email shuld not Null")
	@Column(name = "Email")
	private String email;
	
	//@Size(message = "Select gender")
	@Size(message = "Enter Feedback")
	@Column(name = "Gender")
	private String gender;
	
	@Size(min = 1, message = "Select date of birth")
	@Column(name = "DOB")
	private String dob;
	
	@Size(min = 1, message = "select city")
	@Column(name = "City")
	private String city;
	
	@Size(min = 5, message = "password shuld be >5 character")
	@Column(name = "Password")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
