package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public WebDriver driver;

	
	public void driverInitilize() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\SUMEET\\eclipse-workspace\\seleniumTestNG\\src\\main\\java\\Resources\\data.properties");
		
		
		// access the properties file
		
		Properties prop=new Properties();
		prop.load(fis);
		
		
		String browserName= prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
		}
		
		else if(browserName.equalsIgnoreCase("Edge")) {
		}
		
		else {
			System.out.println("please make sure you have correct browser");
			
		
			
			
		
		
		}
		
		
		
		
	}
	
	
	
	
	
}
