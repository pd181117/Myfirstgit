package com.pdxm.entity;

import javax.validation.constraints.Email;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Component
@Validated//验证
public class Person {

	private String name;

	private String pwd;
	@Email
	private String email;
	
	public Person() {
		super();
	}

	public Person(String name, String pwd, @Email String email) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pwd=" + pwd + ", email=" + email + "]";
	}

	
}
