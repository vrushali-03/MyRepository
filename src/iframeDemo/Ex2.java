package iframeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2
{
   public static void main(String[] args) {
	
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://demoqa.com/nestedframes");
}
}
