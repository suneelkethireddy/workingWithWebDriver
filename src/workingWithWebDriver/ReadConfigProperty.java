package workingWithWebDriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {

	protected InputStream input=null;
	protected Properties prop=null;

	public ReadConfigProperty() {
		try{
			InputStream input=ReadConfigProperty.class.getClassLoader().getResourceAsStream("workingWithWebDriver/config.properties");
			prop=new Properties();
			prop.load(input);

		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public String getUrl(){
		if(prop.getProperty("url")==null)
			return "";
		return prop.getProperty("url");
	}
	public String getBrowser(){
		if(prop.getProperty("browser")==null)
			return "";
		return prop.getProperty("browser");
	}
	public String getUsername(){
		if(prop.getProperty("Username")==null)
			return "";
		return prop.getProperty("Username");
	}
	public String getPassword(){
		if(prop.getProperty("password")==null)
			return "";
		return prop.getProperty("password");
	}


}
