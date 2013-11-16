package com.wooui.chapter1;

public class WrapperTest {
	public Integer i = 12;
	public Float f = 213f;
	public Double d = 234.2d;
	public static void main(String[] args) {
		WrapperTest wt = new WrapperTest();
		System.out.println(wt.f.MAX_EXPONENT);
		System.out.println(wt.d.toHexString(wt.d));
	}
}
