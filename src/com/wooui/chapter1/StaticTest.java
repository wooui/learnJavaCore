package com.wooui.chapter1;

public class StaticTest {
	public static int i = 5;
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		st1.i = 6;
		Incrementable.increment();
		System.out.println(st2.i);
	}
}

class Incrementable{
	private int i = 10;
	
	public static void increment(){
		StaticTest.i++;
	}
}
