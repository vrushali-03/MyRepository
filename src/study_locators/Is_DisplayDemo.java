package study_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_DisplayDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
	   driver.manage().window().maximize();
	
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	   WebElement hideButton = driver.findElement(By.id("hide-textbox"));
	   WebElement showButton = driver.findElement(By.id("show-textbox"));
	   
	   hideButton.click();
	   
	  // showButton.click();
	   
	   Thread.sleep(1000);
	   WebElement hiddenTextBox = driver.findElement(By.id("displayed-text"));
	   
	   if(hiddenTextBox.isDisplayed())
	   {
		   hiddenTextBox.sendKeys("velocity");
	   }
	   else
	   {
		   showButton.click();	 
		   hiddenTextBox.sendKeys("class");
		   
	   
	   }
	   

	}

}
