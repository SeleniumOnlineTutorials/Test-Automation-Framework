package com.united.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookFlight_Hou_Bos {
  
 @Parameters({"message","selenium"})
 @Test(priority=4)
  public void test1(String s, String s1) {
	  System.out.println(s+s1);
	  System.out.println("my changes");
	  
  }
 @Test(priority=1)
 public void test2() {
	  System.out.println("this is test 2");
	  
 }
 @Test(priority=2)
 public void test3() {
	  System.out.println("This is test 3");
	  
 }
 @Test(priority=6)
 public void test4() {
	  System.out.println("This is test 4");
	  
 }
 @Test(priority=3)
 public void test5() {
	  System.out.println("This is test 5");
	  
 }
 @Test(priority=5)
 public void test6() {
	  System.out.println("This is test 6");
	  
	  
 }

 @BeforeTest
 public void beforeTest(){
	 System.out.println("this is before test method");
 }

 @AfterTest
 public void afterTest(){
	 System.out.println("this is after test method");
 }

}
