package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrdered_List
{
  public static void main(String[] args) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Thread.sleep(1000);
	  driver.findElement(By.name("q")).sendKeys("velocity");
	  Thread.sleep(1000);
	  List<WebElement> result = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	  System.out.println(result.size());
	
}
}
