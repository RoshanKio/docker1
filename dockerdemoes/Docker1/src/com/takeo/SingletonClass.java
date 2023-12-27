package com.takeo;

//Singleton logic
public class SingletonClass {
	private static SingletonClass s = new SingletonClass();
	
	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return s;
	}

	@Override
	public String toString() {
		return "SingletonClass class Object";
	}
}


