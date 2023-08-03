package com.cruddemo.entity;

import javax.persistence.*;

@Entity
public class Student {
	
public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;


private String name;


private String course;


private int fee;
}
