package com.dhan.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	@SuppressWarnings("deprecation")
	@NotEmpty
	@Pattern(regexp="[^0-9]+")
	@Size(min=5,max=10)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotNull
	@Min(value = 12)
	@Max(value = 120)
	private Integer	 age;
	
	@NotEmpty
	private String country;

	
	public User(String name, String email, int age, String country) {
	
		this.name = name;
		this.email = email;
		this.age = age;
		this.country = country;
	}
	public User() {
		
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	


}
