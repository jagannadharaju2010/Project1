package pkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoSearch {
 
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).sendKeys("");
		List<WebElement> allSearch = driver.findElements(By.xpath("//span[@class='ssg-title']"));
		int count = allSearch.size();
		for(WebElement e:allSearch) {
			System.out.println(e.getText());
		}
		allSearch.get(0).click();
	}
}
