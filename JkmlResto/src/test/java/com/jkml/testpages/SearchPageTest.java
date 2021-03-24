package com.jkml.testpages;

import org.testng.annotations.Test;

import com.jkml.baseClass.BaseClass;
import com.jkml.pages.SearchPage;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;

public class SearchPageTest extends BaseClass{
	SearchPage s;
  public SearchPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@Test(priority = 1)
  public void postcode() {
	s.EnterPostCode(prop.getProperty("PostCode"));
	System.out.println("post code entered...");
	
  }
@Test(priority = 2)
public void SearchBox() {
	s.ClickOnSearchBox();
}
  @BeforeSuite
  public void beforeSuite() throws IOException {
	  initilization();
	  s = new SearchPage();
	  
  }

}
