package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngreview {
	@Test
	public void f() {
		System.out.println("Test part");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
    }
    @AfterTest
	public void afterTest() {
	System.out.println("After test");
    }

}


