package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessXpath {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("file:///C:/Users/bob/Desktop/r.html");
   driver.findElement(By.xpath("//table/child::tbody")).click(); //Child 
   driver.findElement(By.xpath("//table/descendant::tr")).click(); //
   driver.findElement(By.xpath("//table/parent::body")).click();
   driver.findElement(By.xpath("//table/tbody")).click();
   driver.findElement(By.xpath("//table//tr")).click();
   driver.findElement(By.xpath("//table/..")).click();
	}

}
