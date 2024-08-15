package popUpDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
	
		
		
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(1000);
        String myText = driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).getText();
        System.out.println(myText);
	}

}
