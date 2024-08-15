package multipleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		 Thread.sleep(1000);
		 
		 WebElement multipleSelect = driver.findElement(By.id("cars"));
		 
		 Select s=new Select(multipleSelect);
		 
		 Thread.sleep(1000);
	  System.out.println(s.isMultiple());
	  
	  s.selectByVisibleText("Saab");
	  s.selectByIndex(0);
		

	}

}
