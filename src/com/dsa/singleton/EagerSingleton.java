package com.dsa.singleton;

public class EagerSingleton {
	//this creates the instance in time of loading the class in memory
	
	private static final EagerSingleton instance = new EagerSingleton();
	
	private String name;
	private int age;
	
	
	private EagerSingleton(){
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
	
	public static EagerSingleton getInstance() {
		return instance;
	}

}
