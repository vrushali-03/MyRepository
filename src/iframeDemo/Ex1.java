package iframeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 
{  
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframe-name");
		
		WebElement textResult = driver.findElement(By.xpath("//strong[text()=' Learn Earn & Shine']"));
		String result = textResult.getText();
		System.out.println(result);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("checkBoxOption2")).click();
	}
	

}
