package workingWithWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
interface interfaceOne{
public abstract void dispaly();
String getMsg(String str);
}
interface interfaceTwo{
	void showInt();
}
class baseClass implements interfaceOne,interfaceTwo{
	@Override
	public void dispaly() {
		System.err.println("Interface One Method");
	}
@Override
	public String getMsg(String str) {
		// TODO Auto-generated method stub
		return str;
	}
	@Override
	public void showInt() {
		System.err.println("Inter face two");
	}
}*/
public class TestInterface {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:/chromedriver.exe");
		driver=new ChromeDriver();
		
		/*baseClass obj=new baseClass();
		obj.dispaly();
		System.err.println("Value :"+obj.getMsg("Method"));
		obj.showInt();*/
		/*interfaceOne obj=new baseClass();
		obj.dispaly();
		System.err.println("Value :"+obj.getMsg("Method"));*/


	}

}
