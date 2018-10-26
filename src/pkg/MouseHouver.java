package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouver {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//Open the browser
      WebDriver driver=new ChromeDriver();
      //Maximize the window
      driver.manage().window().maximize();
      //Give the impicit wait
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Enter the URL
      driver.get("https://www.actitime.com/");
      //find the element 'Features'
      WebElement menu = driver.findElement(By.linkText("Features"));
      //Mouse Hover on the menu
      Actions actions=new Actions(driver);
      actions.moveToElement(menu).perform();
      //Click on first sub menu
      driver.findElement(By.linkText("Simple Time Tracking")).click();
	}

}
