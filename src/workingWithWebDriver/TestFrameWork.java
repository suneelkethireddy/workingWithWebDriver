package workingWithWebDriver;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestFrameWork extends StartWebDriver {

	@Test
	public void testCase(){
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url :"+driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Google");
	}
}
