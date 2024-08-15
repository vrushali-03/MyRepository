package popUpDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/auth");
		
		driver.findElement(By.xpath("//span[contains(text(),'Google')]")).click();
		
		//String mainWindowId = driver.getWindowHandle();
		//System.out.println(mainWindowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		//ArrayList<String> al=new ArrayList<String>(allWindowId);
		//System.out.println( al.get(0));
		 //System.out.println(al.get(1));
		
		Iterator<String> it=allWindowId.iterator();
		              String mainPageID = it.next();
		              String ChildPageID = it.next();
		              
		              driver.switchTo().window(ChildPageID);
		              Thread.sleep(1000);
		              driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		              

						
			

	}

}
