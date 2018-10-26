package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("file:///C:/Users/bob/Desktop/Demo.html");
       // org.openqa.selenium.WebElement e = driver.findElement(By.tagName("b"));
        //e.click();
       driver.findElement(By.tagName("a")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       //In the browser find the element by using tag name 'a' and click it//
       driver.findElement(By.id("a1")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(1000);
       driver.findElement(By.name("n1")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       Thread.sleep(1000);
       driver.findElement(By.className("c1")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       driver.findElement(By.linkText("Google")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       driver.findElement(By.partialLinkText("Goo")).click();
       Thread.sleep(1000);
       driver.navigate().back();
       driver.findElement(By.cssSelector("a[id='a1']")).click();
	}

}
