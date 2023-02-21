package com.cls;

public class B implements A {
	public void  m1() {
		System.out.println("122");
	}
	public void m2() {
		System.out.println("sdfgh");
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}
}
