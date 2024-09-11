package com.dsa.singleton;

public class SingletonClass {
	public static void main(String[] args) {
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		eagerSingleton.setName("EagerSingleton");
		eagerSingleton.setAge(19);
		System.out.println("Name : "+eagerSingleton.getName()+
				" Age : "+eagerSingleton.getAge()+
				" You are old enough : "+eagerSingleton.checkAge());
		System.out.println("========================================================");
		
		LazySingleton lazySingleton = LazySingleton.getInstance();
		lazySingleton.setName("LazySingleton");
		lazySingleton.setAge(17);
		System.out.println("Name : "+lazySingleton.getName()+
				" Age : "+lazySingleton.getAge()+
				" You are old enough : "+lazySingleton.checkAge());
		System.out.println("========================================================");
		
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		billPughSingleton.setName("BillPughSingleton");
		billPughSingleton.setAge(21);
		System.out.println("Name : "+billPughSingleton.getName()+
				" Age : "+billPughSingleton.getAge()+
				" You are old enough : "+billPughSingleton.checkAge());
		System.out.println("========================================================");
	}
}
