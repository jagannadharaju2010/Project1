package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithToFrame {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("file:///C:/Users/bob/Desktop/Page1.html");
  //using index
 /* driver.switchTo().frame(0);
  driver.findElement(By.id("t2")).sendKeys("a");
  driver.switchTo().parentFrame();
  driver.findElement(By.id("t1")).sendKeys("A");*/
  //using ID
 /* driver.switchTo().frame("f1");
  driver.findElement(By.id("t2")).sendKeys("AA");
  driver.switchTo().parentFrame();
  driver.findElement(By.id("t1")).sendKeys("BB");*/
  //using Address
  WebElement e = driver.findElement(By.id("f1"));
  driver.switchTo().frame(e);
  driver.findElement(By.id("t2")).sendKeys("AAA");
  driver.switchTo().defaultContent();
  driver.findElement(By.id("t1")).sendKeys("BBB");
	}

}
