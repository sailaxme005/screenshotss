package com.webOrdertest.tests;

import org.testng.annotations.Test;

import com.webOrders.baseclass.BaseClass;

import webordertest.Abc;

public class NewTest extends BaseClass{
	Abc a = new Abc();
  @Test
  public void f() {
	  a.initlization();
  }
}
