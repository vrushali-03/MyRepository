package study_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_SelectedDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radioButton1 = driver.findElement(By.cssSelector("input[value=radio1]"));
		
		//radioButton1.click();
		
		
		if(radioButton1.isSelected())
		{
			System.out.println(" radio button is alrady selected");
		}
		else 
		{
			radioButton1.click();
			System.out.println(" radio button is now selected");
		}
		

	}

}
