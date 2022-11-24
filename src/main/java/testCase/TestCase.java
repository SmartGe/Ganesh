package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {

/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("My before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("My after method");
	}*/
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("My before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("My after suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("My before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("My after class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("My before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("My after test");
	}
	
	@Test
	public void TestCase1() {
		System.out.println("TestCase1");
	}
	
	@Test
	public void TestCase2() {
		System.out.println("TestCase2");
	}
	
	/*@Test
	public void helloh() {
		System.out.println("Mali");
		assertTrue(false);
	}*/
}
	