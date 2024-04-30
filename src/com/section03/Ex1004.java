package com.section03;

import com.javamaster.mypackage.*;

public class Ex1004 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat1.equals(cat2));
		
		cat1 = cat2;
		System.out.println(cat1.equals(cat2));
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		String str1 = cat1.scratch();
		String str2 = cat2.meow();
		String str3 = cat2.scratch();
		
		System.out.println(cat1.equals(str2));
		System.out.println(cat1.equals(str3));
	}
}
