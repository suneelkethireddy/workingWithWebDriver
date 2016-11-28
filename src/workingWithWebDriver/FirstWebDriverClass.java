package workingWithWebDriver;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriverClass {

	public static void main(String[] args) {

		//FirefoxDriver driver=new FirefoxDriver();
		//File file=new File("F:/IEDriverServer_Win32_2.39.0/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		File file=new File("F:/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

}
