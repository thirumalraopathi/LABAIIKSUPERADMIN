package com.qa.base;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DomocranceBase {
	
	public Properties prop;

	public static WebDriver driver;

	public void setUp(String url) {

//		if(prop.getProperty("SafariBrowser").equalsIgnoreCase("safari")){
//			WebDriverManager.safaridriver().setup();
//			driver = new SafariDriver();
//			System.out.println("safari browser is launched");
//
//		}else if(prop.getProperty("FireFoxBrowser").equalsIgnoreCase("firefox")){
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			System.out.println("firefox browser is launched");
//		}else if(prop.getProperty("ChromeBrowser").equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			System.out.println("chrome browser is launched");
//		}else{
//			System.out.println("No browser is launched");
//		}

		//ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
        try {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } finally {

        }
		driver.get(url);
		System.out.println(url);
		driver.manage().window().maximize();
		
	}

	public DomocranceBase() throws IOException {
		
		prop = new Properties();
		try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
		prop.load(ip);
		System.out.println(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
