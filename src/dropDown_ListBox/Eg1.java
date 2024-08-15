package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		  WebElement dropDown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		  
		  Select s=new Select(dropDown);
		  Thread.sleep(1000);
		  
		  //s.selectByIndex(0);
		 // s.selectByValue("option2");
		 s.selectByVisibleText("Option3");

	}

}
