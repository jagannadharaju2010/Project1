package pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSearch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		int count = allLinks.size();
		for(WebElement e:allLinks) {
			System.out.println(e.getText());
		}
       WebElement first = allLinks.get(0);
       first.click();
	}

}
