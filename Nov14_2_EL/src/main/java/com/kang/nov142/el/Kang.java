package com.kang.nov142.el;

// JavaBean
//		name, age, eye, phone


public class Kang {
 private String name;
 private int age;
 private double eye;
 private String phone;
 
 public Kang() {
	// TODO Auto-generated constructor stub
}

public Kang(String name, int age, double eye, String phone) {
	super();
	this.name = name;
	this.age = age;
	this.eye = eye;
	this.phone = phone;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getEye() {
	return eye;
}

public void setEye(double eye) {
	this.eye = eye;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}
 
 

}
