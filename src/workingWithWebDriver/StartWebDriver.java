package workingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartWebDriver {

	public static WebDriver driver=null;
	@BeforeSuite
	public void setUp(){
		try{
			ReadConfigProperty file=new ReadConfigProperty();
			if("chrome".equalsIgnoreCase(file.getBrowser())){
				System.setProperty("webdriver.chrome.driver", StartWebDriver.class.getClassLoader().getResource("workingWithWebDriver/chromedriver.exe").getPath());
				driver=new ChromeDriver();
			}/*else if("exlorer".equalsIgnoreCase(file.getBrowser())){
				System.setProperty("webdriver.ie.driver",StartWebDriver.class.getClassLoader().getResource("workingWithWebDriver/IEDriverServer.exe").getPath());
				driver=new InternetExplorerDriver();
			}
			 */else {
				 driver=new HtmlUnitDriver();
			 }
			driver.get(file.getUrl());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@AfterSuite(alwaysRun=true)
	public void tearDown(){
		driver.close();
		driver.quit();
		if(driver != null)
			driver=null;

	}
}
