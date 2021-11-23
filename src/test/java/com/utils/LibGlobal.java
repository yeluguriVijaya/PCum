package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LibGlobal {
	public static WebDriver driver;
	//to initialize the WebDriver
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Ram Reddy\\eclipse-workspace\\PCum\\driver\\chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	//to enter the url
	
	public static void gerUrl(String url)
	{
		driver.get(url);
	}
	
	//to get the title of app
	public static String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	//to get the current url of app
	public static String getCurrentUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	//close the current browser tab or window
	public static void quitBrowser()
	{
	driver.close();
	}
	//to click the button or link or checkbox or radionbutton

	public static void click(WebElement ele)
	{
	ele.click();
	}
	//to pass the value the textbox
	
	public void insertType(WebElement ele,String val)
	{
		ele.sendKeys(val);
	}


}


