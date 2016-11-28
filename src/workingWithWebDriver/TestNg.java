package workingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {


	//static File file=new File("F:/geckodriver-v0.9.0-win64/geckodriver.exe");

	private static WebDriver driver=null;

	@BeforeClass
	public static void startWebDriver(){
		System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
		//driver=new ChromeDriver();
		driver=new HtmlUnitDriver();
	}
	@Test
	public void testCase(){
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		System.out.println("Url is  :"+driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Google");
		try{
			Thread.sleep(3000);
		}catch(Exception e){}
		driver.get("http://www.yahoo.com");
		System.out.println("Title :"+driver.getTitle());
		System.out.println("Url is  :"+driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Yahoo");

	}
	@AfterClass
	public static void stopWebdriver(){
		driver.close();     //This will close the browser which is currently in focus
		driver.quit();		  //This will close all the browser and stop the webdriver  gracefully
		if(driver !=null)
			driver=null;
	}
}
