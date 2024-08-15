package dropDown_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eg2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php/");
		
		WebElement day = driver.findElement(By.cssSelector("select#day"));
		Select sDay=new Select(day);
		
		//sDay.selectByIndex();
		sDay.selectByValue("3");
		//sDay.selectByVisibleText("");
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sMonth=new Select(month);
		sMonth.selectByValue("1");
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select sYear=new Select(year);
		sYear.selectByVisibleText("1997");
	}

}
