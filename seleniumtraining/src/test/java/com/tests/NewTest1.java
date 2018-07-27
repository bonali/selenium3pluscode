package com.tests;

import org.testng.annotations.Test;
/**
edited

**/
public class NewTest1{
	@Test(priority = 1)
	public void f() {
		System.out.println("inside f()");
	}

	@Test
	public void abc() {
		System.out.println("inside abc()");
	}

	@Test(priority=2)
	public void e() {
		System.out.println("inside e()");
	}

}
