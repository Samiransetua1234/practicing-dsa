package com.dsa.singleton;

public class BillPughSingleton {
	private String name;
	private int age;
	
	
	private BillPughSingleton(){
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
	
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		
		return SingletonHelper.INSTANCE;
	}
	
	
}
