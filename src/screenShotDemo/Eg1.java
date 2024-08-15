package screenShotDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/r.php/");
		 
		   File myFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   System.out.println(myFile);
		   
		   File destination=new File("C:\\Users\\tussh\\OneDrive\\Desktop\\screenshot\\test1.png");
		   
		   FileHandler.copy(myFile, destination);

	}

}
