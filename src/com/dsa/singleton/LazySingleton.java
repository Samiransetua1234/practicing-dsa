package com.dsa.singleton;

public class LazySingleton {
	
	private static LazySingleton instance;
	
	private String name;
	private int age;
	
	
	private LazySingleton(){
		this.name = "Default Name";
		this.age = 18;
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
	
	public void incrementAge() {
		this.age = this.age + 1;
	}
	
	public void decrementAge() {
		this.age = this.age - 1;
	}
	
	public boolean checkAge() {
		return this.age >= 18;
	}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
