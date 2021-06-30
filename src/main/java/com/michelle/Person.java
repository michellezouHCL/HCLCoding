package com.michelle;

public class Person {

	private String name;
	private int age;
	private int shoeSize;
	public Person(String name, int age, int shoeSize) {
		super();
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
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
	public int getShoeSize() {
		return shoeSize;
	}
	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}
	
	private void walking(String name, int age, int shoeSize) {
		System.out.printf("%s, age %d, with shoe size %d, is walking",name, age, shoeSize);
	}
	
	public void startWalking() {
		walking(name, age, shoeSize);
	}

}
