package popUpDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pop_UP {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//handling alert popup
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		driver.findElement(By.cssSelector("input[name=submit]")).click();
		
		// need to switch focus from main page to alert pop-up window
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();	//accept() , dismiuss(), getText()
		
		//alt.dismiss();
		alt.accept();
	    System.out.println(alt.getText());
	    Thread.sleep(2000);
	    alt.accept();
	    String myText = driver.findElement(By.className("barone")).getText();
	    System.out.println(myText);
	}

}
