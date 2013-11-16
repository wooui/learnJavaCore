package com.wooui.chapter1;

import java.util.ArrayList;
import java.util.List;

public class ParameterTest {
	public List list1 = new ArrayList();
	public int i = 10;
	public static void main(String[] args) {
		ParameterTest pt = new ParameterTest();
		pt.paramPrimary(pt.i);
		System.out.println(pt.i); //10
		
		pt.paramReference(pt.list1);
		System.out.println(pt.list1.size());//1
	}
	
	public void paramPrimary(int i){
		i++;
	}
	
	public void paramReference(List list){
		list.add(10);
	}
}
