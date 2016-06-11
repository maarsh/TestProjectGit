package com.mars;

public class HelloWorld {

	public HelloWorld() {
		System.out.println("Hello World");
	}

	public void test(){
		System.out.println("inside test method ");
		System.out.println("new file");
	}
	
	public void test2() {
		System.out.println("feature branch change ");
		System.out.println("another change in feature");
	}
	
	public static void main(String[] args) {
		new HelloWorld();
	}

}
