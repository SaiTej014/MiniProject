package Cognizant;

import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	 
	        public static void takeScreenshot(WebDriver driver, String Name) throws IOException{
	        	File fileobj = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        	FileUtils.copyFile(fileobj, new File("C:\\Users\\2304133\\eclipse-workspace\\2304133\\screenshots\\"+Name+".png"));
	        
	}

}
