package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Thread.sleep(4000);
		
		
		 List<WebElement> result = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		int numOfRow = result.size();
		System.out.println(numOfRow);
		
		
		int numOfCol = driver.findElements(By.xpath("//table[@name='courses']//tr[1]//th")).size();
		System.out.println(numOfCol);
	}

}
