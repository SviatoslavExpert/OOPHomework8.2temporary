package com.gmail.s.granovskiy;

public class Mouse {
	//  fields
	private String name;
	private int age;
	private boolean sex;
	//constructors
	public Mouse(String name, int age, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Mouse() {
		super();
	}
	//getters and setters
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
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	//toString
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	

}
