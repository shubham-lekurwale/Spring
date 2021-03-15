package com.sl.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Shubham
 *
 */
@Entity
@Table(name = "Feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name = "system-increment", strategy = "increment")
	private Integer id;
	
	@Size(min = 1, message = "Name shuld not Null")
	@Column(name = "Name")
	private String name;
	
	@Size(min = 1, message = "Email shuld not Null")
	@Column(name = "Email")
	private String email;
	
	@Size(message = "Enter Your Feedback")
	@Column(name = "feedback")
	private String feedback;

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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
