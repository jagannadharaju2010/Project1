package pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("file:///C:/Users/bob/Desktop/webpage.html");
       //driver.findElement(By.linkText("Gmail")).click();
       List<WebElement> allLinks = driver.findElements(By.tagName("a"));
       int count = allLinks.size();
       System.out.println(count);
       allLinks.get(1).click();
      // link.click();
	}

}
