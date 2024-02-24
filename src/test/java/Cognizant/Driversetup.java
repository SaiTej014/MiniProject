package Cognizant;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driversetup {
	
	static WebDriver driver;
	
	
	public WebDriver createDriver() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name: ");
		String browser = sc.next();
		sc.close();
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
		
			driver = new EdgeDriver();
		}
		return driver;
	}


}
