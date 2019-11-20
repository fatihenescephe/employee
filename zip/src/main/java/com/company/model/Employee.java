package com.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity								//entity oluşturduk
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private int age;
    private String email;
	
    
    
  
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeController [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", email="
				+ email + "]";
	}

    
}
