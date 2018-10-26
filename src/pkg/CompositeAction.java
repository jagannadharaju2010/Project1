package pkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeAction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		//CTRL+Click (its an example for composite action -> Multiple actions at a time
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(2000);
		//In this example getWindowHandles return windowHandle of all the TABs
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());
		for(String wh:allWHS) {
			driver.switchTo().window(wh);  //Switch to tab
			System.out.println(driver.getTitle());
		}
		driver.close();

	}

}
