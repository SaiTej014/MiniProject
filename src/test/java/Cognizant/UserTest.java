package Cognizant;

import java.io.IOException;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UserTest {
	static WebDriver driver;
	public static String[] data;
	
	static Driversetup d = new Driversetup();
	
	
	public String[] getData() throws IOException {
		data=ExcelUtils.readExcelData("data");
		return data;
	}

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		UserTest user=new UserTest();
		
		WebDriver driver=d.createDriver();
		user.getData();

		
	            // Opening the website
	            driver.get("http://change2naturalfoods.com/");
	            Thread.sleep(1000);

	            // Maximize the window
	            driver.manage().window().maximize();
	            
	            Screenshot.takeScreenshot(driver, "browser");

	            // Locate Login/Register button and click
	            WebElement regBtn = driver.findElement(By.linkText("Login/Register"));
	            
	            
	            regBtn.click();

	            // Enter unregistered email and password
	            driver.findElement(By.id("email")).sendKeys(data[0]);
	            
	            Screenshot.takeScreenshot(driver, "email"); 
	            
	            driver.findElement(By.id("password")).sendKeys(data[1]);
	            
	            Screenshot.takeScreenshot(driver, "password");

	            // Click login button
	            WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	            loginBtn.click();

	            // verify error message
	            WebElement alt = driver.findElement(By.cssSelector("body > section > div > div > div:nth-child(1) > div.alert.alert-danger.alert-dismissible.fade.show"));
	            
	            Screenshot.takeScreenshot(driver, "message");
	            
	            System.out.println(alt.getText());

	        
	        
	            
	                driver.quit();
	            
	        }
	}

