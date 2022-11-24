package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tsr {
	
	@Test
	public void hello() {
		System.out.println("Test");
	}
	
	@BeforeMethod
	public void hello1() {
		System.out.println("Before");
	}
	@AfterMethod
	public void hello3() {
		System.out.println("After");
	}
	
	@AfterSuite
	public void hello2() {
		System.out.println("Test2");
		
	}

}
