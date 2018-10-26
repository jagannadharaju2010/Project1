package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@class='gb_b gb_ec']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='gb49']//span[@class='gb_W']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Google Drive – Cloud Storage & File Backup for Photos, Docs & More"));*/
		driver.get("https://www.google.com/intl/en-GB/drive/");
		driver.findElement(By.xpath("(//a[text()='Go to Google Drive'])[2]")).click();
		driver.findElement(By.id("identifierId")).sendKeys("jagannadharaju2010@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();	
		driver.findElement(By.xpath("//div[text()='Enter your password']")).sendKeys("9611445793");
		/*if(driver.findElement(By.name("password")).isDisplayed()){
			driver.findElement(By.name("password")).sendKeys("9611445793");
		}
		else {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}*/
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		WebElement buttonLink = driver.findElement(By.xpath("(//div[@class='l-u-Ab-zb-Pn-ve'])[1]"));
		Actions actions=new Actions(driver);
		actions.doubleClick(buttonLink).perform();
		
		

	}

}
